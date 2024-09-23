import java.applet.Applet;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink")
public class signlink implements Runnable {

    @OriginalMember(owner = "signlink", name = "socket", descriptor = "Ljava/net/Socket;")
    private static Socket socket = null;

    @OriginalMember(owner = "signlink", name = "threadreqpri", descriptor = "I")
    private static int threadreqpri = 1;

    @OriginalMember(owner = "signlink", name = "threadreq", descriptor = "Ljava/lang/Runnable;")
    private static Runnable threadreq = null;

    @OriginalMember(owner = "signlink", name = "dnsreq", descriptor = "Ljava/lang/String;")
    private static String dnsreq = null;

    @OriginalMember(owner = "signlink", name = "dns", descriptor = "Ljava/lang/String;")
    private static String dns = null;

    @OriginalMember(owner = "signlink", name = "loadreq", descriptor = "Ljava/lang/String;")
    private static String loadreq = null;

    @OriginalMember(owner = "signlink", name = "loadbuf", descriptor = "[B")
    private static byte[] loadbuf = null;

    @OriginalMember(owner = "signlink", name = "savereq", descriptor = "Ljava/lang/String;")
    private static String savereq = null;

    @OriginalMember(owner = "signlink", name = "savebuf", descriptor = "[B")
    private static byte[] savebuf = null;

    @OriginalMember(owner = "signlink", name = "urlreq", descriptor = "Ljava/lang/String;")
    private static String urlreq = null;

    @OriginalMember(owner = "signlink", name = "urlstream", descriptor = "Ljava/io/DataInputStream;")
    private static DataInputStream urlstream = null;

    @OriginalMember(owner = "signlink", name = "midi", descriptor = "Ljava/lang/String;")
    public static String midi = null;

    @OriginalMember(owner = "signlink", name = "jingle", descriptor = "Ljava/lang/String;")
    public static String jingle = null;

    @OriginalMember(owner = "signlink", name = "jinglelen", descriptor = "I")
    public static int jinglelen = 3500;

    @OriginalMember(owner = "signlink", name = "looprate", descriptor = "I")
    public static int looprate = 100;

    @OriginalMember(owner = "signlink", name = "socketreq", descriptor = "I")
    private static int socketreq;

    @OriginalMember(owner = "signlink", name = "mainapp", descriptor = "Ljava/applet/Applet;")
    public static Applet mainapp;

    @OriginalMember(owner = "signlink", name = "socketip", descriptor = "Ljava/net/InetAddress;")
    private static InetAddress socketip;

    @OriginalMember(owner = "signlink", name = "active", descriptor = "Z")
    private static boolean active;

    @OriginalMember(owner = "signlink", name = "sunjava", descriptor = "Z")
    public static boolean sunjava;

    @OriginalMember(owner = "signlink", name = "startpriv", descriptor = "(Ljava/net/InetAddress;)V", line = 43)
    public static final void startpriv(InetAddress arg0) {
        if (!active) {
            socketip = arg0;
            Thread var1 = new Thread(new signlink());
            var1.setDaemon(true);
            var1.start();
        }
    }

    @OriginalMember(owner = "signlink", name = "run", descriptor = "()V", line = 50)
    public final void run() {
        if (active) {
            return;
        }
        active = true;
        String var1 = findcachedir();
        while (true) {
            if (socketreq != 0) {
                try {
                    socket = new Socket(socketip, socketreq);
                } catch (Exception var7) {
                    socket = null;
                }
                socketreq = 0;
            }
            if (threadreq != null) {
                Thread var2 = new Thread(threadreq);
                var2.setDaemon(true);
                var2.start();
                var2.setPriority(threadreqpri);
                threadreq = null;
            }
            if (dnsreq != null) {
                try {
                    dns = InetAddress.getByName(dnsreq).getHostName();
                } catch (Exception var8) {
                    dns = "unknown";
                }
                dnsreq = null;
            }
            if (loadreq != null) {
                loadbuf = null;
                try {
                    File var3 = new File(var1 + loadreq);
                    if (var3.exists()) {
                        int var4 = (int) var3.length();
                        loadbuf = new byte[var4];
                        DataInputStream var5 = new DataInputStream(new FileInputStream(var1 + loadreq));
                        var5.readFully(loadbuf, 0, var4);
                        var5.close();
                    }
                } catch (Exception var9) {
                }
                loadreq = null;
            }
            if (savereq != null) {
                try {
                    FileOutputStream var6 = new FileOutputStream(var1 + savereq);
                    var6.write(savebuf, 0, savebuf.length);
                    var6.close();
                } catch (Exception var10) {
                }
                savereq = null;
            }
            if (urlreq != null) {
                try {
                    urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
                } catch (Exception var11) {
                    urlstream = null;
                }
                urlreq = null;
            }
            try {
                Thread.sleep((long) looprate);
            } catch (Exception var12) {
            }
        }
    }

    @OriginalMember(owner = "signlink", name = "findcachedir", descriptor = "()Ljava/lang/String;", line = 106)
    public static final String findcachedir() {
        String[] var0 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
        String var1 = ".file_store_32";
        for (int var2 = 0; var2 < var0.length; var2++) {
            try {
                String var3 = var0[var2];
                if (var3.length() > 0) {
                    File var4 = new File(var3);
                    if (!var4.exists()) {
                        continue;
                    }
                }
                File var5 = new File(var3 + var1);
                if (var5.exists() || var5.mkdir()) {
                    return var3 + var1 + "/";
                }
            } catch (Exception var6) {
            }
        }
        return null;
    }

    @OriginalMember(owner = "signlink", name = "gethash", descriptor = "(Ljava/lang/String;)J", line = 125)
    public static final long gethash(String arg0) {
        String var1 = arg0.trim();
        long var2 = 0L;
        for (int var4 = 0; var4 < var1.length() && var4 < 12; var4++) {
            char var5 = var1.charAt(var4);
            var2 *= 37L;
            if (var5 >= 'A' && var5 <= 'Z') {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 'a' && var5 <= 'z') {
                var2 += var5 + 1 - 97;
            } else if (var5 >= '0' && var5 <= '9') {
                var2 += var5 + 27 - 48;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "signlink", name = "looprate", descriptor = "(I)V", line = 141)
    public static final void looprate(int arg0) {
        looprate = arg0;
    }

    @OriginalMember(owner = "signlink", name = "cacheload", descriptor = "(Ljava/lang/String;)[B", line = 145)
    public static final byte[] cacheload(String arg0) {
        if (!active) {
            return null;
        } else if (loadreq == null) {
            loadreq = String.valueOf(gethash(arg0));
            while (loadreq != null) {
                try {
                    Thread.sleep(1L);
                } catch (Exception var1) {
                }
            }
            return loadbuf;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "signlink", name = "cachesave", descriptor = "(Ljava/lang/String;[B)V", line = 155)
    public static final void cachesave(String arg0, byte[] arg1) {
        if (!active || (savereq != null || arg1.length > 2000000)) {
            return;
        }
        savebuf = arg1;
        savereq = String.valueOf(gethash(arg0));
        while (savereq != null) {
            try {
                Thread.sleep(1L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "signlink", name = "opensocket", descriptor = "(I)Ljava/net/Socket;", line = 165)
    public static final Socket opensocket(int arg0) throws IOException {
        socketreq = arg0;
        while (socketreq != 0) {
            try {
                Thread.sleep(50L);
            } catch (Exception var1) {
            }
        }
        if (socket == null) {
            throw new IOException("could not open socket");
        }
        return socket;
    }

    @OriginalMember(owner = "signlink", name = "dnslookup", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 174)
    public static final String dnslookup(String arg0) {
        return "unknown";
    }

    @OriginalMember(owner = "signlink", name = "startthread", descriptor = "(Ljava/lang/Runnable;I)V", line = 178)
    public static final void startthread(Runnable arg0, int arg1) {
        threadreqpri = arg1;
        threadreq = arg0;
    }

    @OriginalMember(owner = "signlink", name = "openurl", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;", line = 182)
    public static final DataInputStream openurl(String arg0) throws IOException {
        urlreq = arg0;
        while (urlreq != null) {
            try {
                Thread.sleep(50L);
            } catch (Exception var1) {
            }
        }
        if (urlstream == null) {
            throw new IOException("could not open: " + arg0);
        }
        return urlstream;
    }
}
