package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ba")
public class class32 {

	@ObfuscatedName("ba.ap")
	public static Applet field159 = null;

	@ObfuscatedName("ba.aq")
	public static String field160 = "";

	public class32() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ax.af(Ljava/lang/String;ZZI)V")
	public static void method325(String arg0, boolean arg1, boolean arg2) {
		method36(arg0, arg1, "openjs", arg2);
	}

	@ObfuscatedName("ao.aw(Ljava/lang/String;ZLjava/lang/String;ZI)V")
	public static void method36(String arg0, boolean arg1, String arg2, boolean arg3) {
		if (!arg1) {
			method3452(arg0, 3, "openjs");
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (Exception var5) {
			}
		}
		if (field160.startsWith("win") && !arg3) {
			method3452(arg0, 0, "openjs");
			return;
		}
		if (field160.startsWith("mac")) {
			method3452(arg0, 1, arg2);
			return;
		}
		method3452(arg0, 2, "openjs");
	}

	@ObfuscatedName("ev.at(Ljava/lang/String;ILjava/lang/String;I)Z")
	public static boolean method3452(String arg0, int arg1, String arg2) {
		if (arg1 == 0) {
			try {
				if (!field160.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int var4 = 0; var4 < arg0.length(); var4++) {
						if (var3.indexOf(arg0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (Throwable var12) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				Object var6 = class27.method401(field159, arg2, new Object[] { (new URL(field159.getCodeBase(), arg0)).toString() });
				return var6 != null;
			} catch (Throwable var13) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				field159.getAppletContext().showDocument(new URL(field159.getCodeBase(), arg0), "_blank");
				return true;
			} catch (Exception var14) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Applet var9 = field159;
				JSObject.getWindow(var9).call("loggedout", null);
			} catch (Throwable var16) {
			}
			try {
				field159.getAppletContext().showDocument(new URL(field159.getCodeBase(), arg0), "_top");
				return true;
			} catch (Exception var15) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
