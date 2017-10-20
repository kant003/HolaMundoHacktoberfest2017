using System;
using GTA;

namespace GTAV_ArmorRecovery
{
    public class ArmorRecovery : Script
    {
        private int nativeArmor;
        private int prevArmor;
        private Ped prevPlayer;
        private const bool debugActivated = true;

        public ArmorRecovery()
        {
            Tick += OnTick;
            Interval = 100;
        }

        private void debug(string s)
        {
            GTA.UI.ShowSubtitle(s);
        }

        private void OnTick(object sender, EventArgs e)
        {
            Ped player = Game.Player.Character;
            int armor = player.Armor;

            bool hasArmor = false;
            if (player.Armor > 0) hasArmor = true;
            if (player != prevPlayer) {
                debug("Player character has changed!");
            }
            else if (armor < prevArmor) {
                debug("Armor decreased! (from " + prevArmor.ToString() + " to " + armor.ToString() + ")");
            }
            else if (armor > prevArmor) {
                debug("Armor increased! (from " + prevArmor.ToString() + " to " + armor.ToString() + ")");
            }

            prevArmor = armor;
            prevPlayer = player;
        }

    }
}