package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("en")
public class class138 {

    @ObfuscatedName("en.d")
    public static Applet field2113 = null;

    @ObfuscatedName("en.p")
    public static String field2111 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.d(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2671(Applet arg0, String arg1) {
        field2113 = arg0;
        field2111 = arg1;
    }

    @ObfuscatedName("ap.p(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method727(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method37(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2111.startsWith("win") && !arg3) {
            method37(arg0, 0, "openjs");
            return;
        }
        if (field2111.startsWith("mac")) {
            method37(arg0, 1, arg2);
            return;
        }
        method37(arg0, 2, "openjs");
    }

    @ObfuscatedName("v.v(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method37(String arg0, int arg1, String arg2) {
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
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class132.method2711(field2113, arg2, new Object[] { (new URL(field2113.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2113.getAppletContext().showDocument(new URL(field2113.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2113;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2113.getAppletContext().showDocument(new URL(field2113.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
