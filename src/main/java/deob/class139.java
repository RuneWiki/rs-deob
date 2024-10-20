package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("er")
public class class139 {

    @ObfuscatedName("er.j")
    public static Applet field2116 = null;

    @ObfuscatedName("er.h")
    public static String field2111 = null;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.j(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method96(Applet arg0, String arg1) {
        field2116 = arg0;
        field2111 = arg1;
    }

    @ObfuscatedName("ac.h(Ljava/lang/String;ZZI)V")
    public static void method957(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            Statics.method2151(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2111.startsWith("win") && !arg2) {
            Statics.method2151(arg0, 0);
        } else if (field2111.startsWith("mac")) {
            method650(arg0, 1, "openjs");
        } else {
            Statics.method2151(arg0, 2);
        }
    }

    @ObfuscatedName("am.z(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method650(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2111.startsWith("win")) {
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
                Object var6 = class133.method2671(field2116, arg2, new Object[] { (new URL(field2116.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2116.getAppletContext().showDocument(new URL(field2116.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class133.method2670(field2116, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2116.getAppletContext().showDocument(new URL(field2116.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
