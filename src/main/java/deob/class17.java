package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.s")
    public static Applet field90 = null;

    @ObfuscatedName("u.t")
    public static String field88 = "";

    public class17() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.s(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1703(Applet arg0, String arg1) {
        field90 = arg0;
        if (arg1 != null) {
            field88 = arg1;
        }
    }

    @ObfuscatedName("at.v(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method782(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2696(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field88.startsWith("win") && !arg3) {
            method2696(arg0, 0, "openjs");
            return;
        }
        if (field88.startsWith("mac")) {
            method2696(arg0, 1, arg2);
            return;
        }
        method2696(arg0, 2, "openjs");
    }

    @ObfuscatedName("em.j(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2696(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field88.startsWith("win")) {
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
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class15.method151(field90, arg2, new Object[] { (new URL(field90.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field90.getAppletContext().showDocument(new URL(field90.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class15.method144(field90, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field90.getAppletContext().showDocument(new URL(field90.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
