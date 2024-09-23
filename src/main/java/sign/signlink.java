package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sign/signlink")
public class signlink implements Runnable {

    @OriginalMember(owner = "sign/signlink", name = "socket", descriptor = "Ljava/net/Socket;")
    private static Socket socket = null;

    @OriginalMember(owner = "sign/signlink", name = "threadreqpri", descriptor = "I")
    private static int threadreqpri = 1;

    @OriginalMember(owner = "sign/signlink", name = "threadreq", descriptor = "Ljava/lang/Runnable;")
    private static Runnable threadreq = null;

    @OriginalMember(owner = "sign/signlink", name = "dnsreq", descriptor = "Ljava/lang/String;")
    private static String dnsreq = null;

    @OriginalMember(owner = "sign/signlink", name = "dns", descriptor = "Ljava/lang/String;")
    public static String dns = null;

    @OriginalMember(owner = "sign/signlink", name = "loadreq", descriptor = "Ljava/lang/String;")
    private static String loadreq = null;

    @OriginalMember(owner = "sign/signlink", name = "loadbuf", descriptor = "[B")
    private static byte[] loadbuf = null;

    @OriginalMember(owner = "sign/signlink", name = "savereq", descriptor = "Ljava/lang/String;")
    private static String savereq = null;

    @OriginalMember(owner = "sign/signlink", name = "savebuf", descriptor = "[B")
    private static byte[] savebuf = null;

    @OriginalMember(owner = "sign/signlink", name = "urlreq", descriptor = "Ljava/lang/String;")
    private static String urlreq = null;

    @OriginalMember(owner = "sign/signlink", name = "urlstream", descriptor = "Ljava/io/DataInputStream;")
    private static DataInputStream urlstream = null;

    @OriginalMember(owner = "sign/signlink", name = "looprate", descriptor = "I")
    private static int looprate = 50;

    @OriginalMember(owner = "sign/signlink", name = "midi", descriptor = "Ljava/lang/String;")
    public static String midi = null;

    @OriginalMember(owner = "sign/signlink", name = "wave", descriptor = "Ljava/lang/String;")
    public static String wave = null;

    @OriginalMember(owner = "sign/signlink", name = "reporterror", descriptor = "Z")
    public static boolean reporterror = true;

    @OriginalMember(owner = "sign/signlink", name = "errorname", descriptor = "Ljava/lang/String;")
    public static String errorname = "";

    @OriginalMember(owner = "sign/signlink", name = "clientversion", descriptor = "I")
    public static final int clientversion = 225;

    @OriginalMember(owner = "sign/signlink", name = "midifade", descriptor = "I")
    public static int midifade;

    @OriginalMember(owner = "sign/signlink", name = "midipos", descriptor = "I")
    private static int midipos;

    @OriginalMember(owner = "sign/signlink", name = "midivol", descriptor = "I")
    public static int midivol;

    @OriginalMember(owner = "sign/signlink", name = "savelen", descriptor = "I")
    private static int savelen;

    @OriginalMember(owner = "sign/signlink", name = "socketreq", descriptor = "I")
    private static int socketreq;

    @OriginalMember(owner = "sign/signlink", name = "threadliveid", descriptor = "I")
    private static int threadliveid;

    @OriginalMember(owner = "sign/signlink", name = "uid", descriptor = "I")
    public static int uid;

    @OriginalMember(owner = "sign/signlink", name = "wavepos", descriptor = "I")
    private static int wavepos;

    @OriginalMember(owner = "sign/signlink", name = "wavevol", descriptor = "I")
    public static int wavevol;

    @OriginalMember(owner = "sign/signlink", name = "mainapp", descriptor = "Ljava/applet/Applet;")
    public static Applet mainapp;

    @OriginalMember(owner = "sign/signlink", name = "socketip", descriptor = "Ljava/net/InetAddress;")
    private static InetAddress socketip;

    @OriginalMember(owner = "sign/signlink", name = "active", descriptor = "Z")
    private static boolean active;

    @OriginalMember(owner = "sign/signlink", name = "midiplay", descriptor = "Z")
    private static boolean midiplay;

    @OriginalMember(owner = "sign/signlink", name = "sunjava", descriptor = "Z")
    public static boolean sunjava;

    @OriginalMember(owner = "sign/signlink", name = "waveplay", descriptor = "Z")
    private static boolean waveplay;

    @OriginalMember(owner = "sign/signlink", name = "startpriv", descriptor = "(Ljava/net/InetAddress;)V", line = 58)
    public static final void startpriv(InetAddress arg0) {
        threadliveid = (int) (Math.random() * 9.9999999E7D);
        if (active) {
            try {
                Thread.sleep(500L);
            } catch (Exception var3) {
            }
            active = false;
        }
        socketreq = 0;
        threadreq = null;
        dnsreq = null;
        loadreq = null;
        savereq = null;
        urlreq = null;
        socketip = arg0;
        Thread var1 = new Thread(new signlink());
        var1.setDaemon(true);
        var1.start();
        while (!active) {
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "run", descriptor = "()V", line = 75)
    public final void run() {
        active = true;
        String var1 = findcachedir();
        uid = getuid(var1);
        int var2 = threadliveid;
        while (threadliveid == var2) {
            if (socketreq != 0) {
                try {
                    socket = new Socket(socketip, socketreq);
                } catch (Exception var8) {
                    socket = null;
                }
                socketreq = 0;
            } else if (threadreq != null) {
                Thread var3 = new Thread(threadreq);
                var3.setDaemon(true);
                var3.start();
                var3.setPriority(threadreqpri);
                threadreq = null;
            } else if (dnsreq != null) {
                try {
                    dns = InetAddress.getByName(dnsreq).getHostName();
                } catch (Exception var13) {
                    dns = "unknown";
                }
                dnsreq = null;
            } else if (loadreq != null) {
                loadbuf = null;
                try {
                    File var4 = new File(var1 + loadreq);
                    if (var4.exists()) {
                        int var5 = (int) var4.length();
                        loadbuf = new byte[var5];
                        DataInputStream var6 = new DataInputStream(new FileInputStream(var1 + loadreq));
                        var6.readFully(loadbuf, 0, var5);
                        var6.close();
                    }
                } catch (Exception var12) {
                }
                loadreq = null;
            } else if (savereq != null) {
                if (savebuf != null) {
                    try {
                        FileOutputStream var7 = new FileOutputStream(var1 + savereq);
                        var7.write(savebuf, 0, savelen);
                        var7.close();
                    } catch (Exception var11) {
                    }
                }
                if (waveplay) {
                    wave = var1 + savereq;
                    waveplay = false;
                }
                if (midiplay) {
                    midi = var1 + savereq;
                    midiplay = false;
                }
                savereq = null;
            } else if (urlreq != null) {
                try {
                    urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
                } catch (Exception var10) {
                    urlstream = null;
                }
                urlreq = null;
            }
            try {
                Thread.sleep((long) looprate);
            } catch (Exception var9) {
            }
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "findcachedir", descriptor = "()Ljava/lang/String;", line = 140)
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

    @OriginalMember(owner = "sign/signlink", name = "getuid", descriptor = "(Ljava/lang/String;)I", line = 160)
    private static final int getuid(String arg0) {
        try {
            File var1 = new File(arg0 + "uid.dat");
            if (!var1.exists() || var1.length() < 4L) {
                DataOutputStream var2 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
                var2.writeInt((int) (Math.random() * 9.9999999E7D));
                var2.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var3 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
            int var4 = var3.readInt();
            var3.close();
            return var4 + 1;
        } catch (Exception var5) {
            return 0;
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "gethash", descriptor = "(Ljava/lang/String;)J", line = 179)
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

    @OriginalMember(owner = "sign/signlink", name = "looprate", descriptor = "(I)V", line = 195)
    public static final void looprate(int arg0) {
        looprate = arg0;
    }

    @OriginalMember(owner = "sign/signlink", name = "cacheload", descriptor = "(Ljava/lang/String;)[B", line = 199)
    public static final synchronized byte[] cacheload(String arg0) {
        if (!active) {
            return null;
        }
        loadreq = String.valueOf(gethash(arg0));
        while (loadreq != null) {
            try {
                Thread.sleep(1L);
            } catch (Exception var1) {
            }
        }
        return loadbuf;
    }

    @OriginalMember(owner = "sign/signlink", name = "cachesave", descriptor = "(Ljava/lang/String;[B)V", line = 206)
    public static final synchronized void cachesave(String arg0, byte[] arg1) {
        if (!active || arg1.length > 2000000) {
            return;
        }
        while (savereq != null) {
            try {
                Thread.sleep(1L);
            } catch (Exception var3) {
            }
        }
        savelen = arg1.length;
        savebuf = arg1;
        savereq = String.valueOf(gethash(arg0));
        while (savereq != null) {
            try {
                Thread.sleep(1L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "opensocket", descriptor = "(I)Ljava/net/Socket;", line = 214)
    public static final synchronized Socket opensocket(int arg0) throws IOException {
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

    @OriginalMember(owner = "sign/signlink", name = "openurl", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;", line = 221)
    public static final synchronized DataInputStream openurl(String arg0) throws IOException {
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

    @OriginalMember(owner = "sign/signlink", name = "dnslookup", descriptor = "(Ljava/lang/String;)V", line = 228)
    public static final synchronized void dnslookup(String arg0) {
        dns = arg0;
        dnsreq = arg0;
    }

    @OriginalMember(owner = "sign/signlink", name = "startthread", descriptor = "(Ljava/lang/Runnable;I)V", line = 233)
    public static final synchronized void startthread(Runnable arg0, int arg1) {
        threadreqpri = arg1;
        threadreq = arg0;
    }

    @OriginalMember(owner = "sign/signlink", name = "wavesave", descriptor = "([BI)Z", line = 237)
    public static final synchronized boolean wavesave(byte[] arg0, int arg1) {
        if (arg1 > 2000000) {
            return false;
        } else if (savereq == null) {
            wavepos = (wavepos + 1) % 5;
            savelen = arg1;
            savebuf = arg0;
            waveplay = true;
            savereq = "sound" + wavepos + ".wav";
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "wavereplay", descriptor = "()Z", line = 245)
    public static final synchronized boolean wavereplay() {
        if (savereq == null) {
            savebuf = null;
            waveplay = true;
            savereq = "sound" + wavepos + ".wav";
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "sign/signlink", name = "midisave", descriptor = "([BI)V", line = 251)
    public static final synchronized void midisave(byte[] arg0, int arg1) {
        if (arg1 > 2000000 || savereq != null) {
            return;
        }
        midipos = (midipos + 1) % 5;
        savelen = arg1;
        savebuf = arg0;
        midiplay = true;
        savereq = "jingle" + midipos + ".mid";
    }

    @OriginalMember(owner = "sign/signlink", name = "reporterror", descriptor = "(Ljava/lang/String;)V", line = 265)
    public static final void reporterror(String arg0) {
        if (!reporterror || !active) {
            return;
        }
        System.out.println("Error: " + arg0);
        try {
            String var1 = arg0.replace('@', '_');
            String var2 = var1.replace('&', '_');
            String var3 = var2.replace('#', '_');
            DataInputStream var4 = openurl("reporterror" + 225 + ".cgi?error=" + errorname + " " + var3);
            var4.readLine();
            var4.close();
        } catch (IOException var5) {
        }
    }
}
