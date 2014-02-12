package mods.roborave.edm.helper;

import mods.roborave.edm.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * CarbonMod
 *
 * @author jmanpenilla
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class LocalizationHandler{

    @SuppressWarnings("deprecation")
	public static void init(){

/**
 * For all files registered in Localizations.java, add them to the Localization Library.
 * This way we can use this file to add localizations (names).
 */
        for(String LocationFile: Localizations.localeFiles){

            LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationsHelper.getLocaleFromFileName(LocationFile), LocalizationsHelper.isXMLLanguageFile(LocationFile));
        }
    }
}