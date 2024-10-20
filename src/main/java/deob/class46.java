package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("aq")
public class class46 {

    @ObfuscatedName("aq.z")
    public static Applet field379 = null;

    @ObfuscatedName("aq.w")
    public static String field380 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lj.z(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method5282(Applet arg0, String arg1) {
        field379 = arg0;
        if (arg1 != null) {
            field380 = arg1;
        }
    }

    @ObfuscatedName("jd.w(Ljava/lang/String;ZZI)V")
    public static void method4762(String arg0, boolean arg1, boolean arg2) {
        method974(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("bh.s(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method974(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method2858(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field380.startsWith("win") && !arg3) {
            Statics.method2858(arg0, 0);
            return;
        }
        if (field380.startsWith("mac")) {
            method113(arg0, 1, arg2);
            return;
        }
        Statics.method2858(arg0, 2);
    }

    @ObfuscatedName("f.u(Ljava/lang/String;ILjava/lang/String;S)Z")
    public static boolean method113(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field380.startsWith("win")) {
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
                Object var6 = class42.method621(field379, arg2, new Object[] { (new URL(field379.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field379.getAppletContext().showDocument(new URL(field379.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class42.method623(field379, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field379.getAppletContext().showDocument(new URL(field379.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
