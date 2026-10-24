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

public final class signlink implements Runnable {

	public static Socket socket = null;

	public static int threadreqpri = 1;

	public static Runnable threadreq = null;

	public static String dnsreq = null;

	public static String dns = null;

	public static String loadreq = null;

	public static byte[] loadbuf = null;

	public static String savereq = null;

	public static byte[] savebuf = null;

	public static String urlreq = null;

	public static DataInputStream urlstream = null;

	public static int looprate = 50;

	public static String midi = null;

	public static String wave = null;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final int clientversion = 225;

	public static int midifade;

	public static int midipos;

	public static int midivol;

	public static int savelen;

	public static int socketreq;

	public static int threadliveid;

	public static int uid;

	public static int wavepos;

	public static int wavevol;

	public static Applet mainapp;

	public static InetAddress socketip;

	public static boolean active;

	public static boolean midiplay;

	public static boolean sunjava;

	public static boolean waveplay;

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
				Thread.sleep(looprate);
			} catch (Exception var9) {
			}
		}
	}

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

	public static final int getuid(String arg0) {
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

	public static final long gethash(String arg0) {
		arg0 = arg0.trim();
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length() && var3 < 12; var3++) {
			char var4 = arg0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += var4 + 1 - 97;
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += var4 + 27 - 48;
			}
		}

		return var1;
	}

	public static final void looprate(int arg0) {
		looprate = arg0;
	}

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

	public static final synchronized void cachesave(String arg0, byte[] arg1) {
		if (active && arg1.length <= 2000000) {
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
	}

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

	public static final synchronized void dnslookup(String arg0) {
		dns = arg0;
		dnsreq = arg0;
	}

	public static final synchronized void startthread(Runnable arg0, int arg1) {
		threadreqpri = arg1;
		threadreq = arg0;
	}

	public static final synchronized boolean wavesave(byte[] arg0, int arg1) {
		if (arg1 > 2000000) {
			return false;
		}

		if (savereq == null) {
			wavepos = (wavepos + 1) % 5;
			savelen = arg1;
			savebuf = arg0;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}

		return false;
	}

	public static final synchronized boolean wavereplay() {
		if (savereq == null) {
			savebuf = null;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}

		return false;
	}

	public static final synchronized void midisave(byte[] arg0, int arg1) {
		if (arg1 <= 2000000 && savereq == null) {
			midipos = (midipos + 1) % 5;
			savelen = arg1;
			savebuf = arg0;
			midiplay = true;
			savereq = "jingle" + midipos + ".mid";
		}
	}

	public static final void reporterror(String arg0) {
		if (reporterror && active) {
			System.out.println("Error: " + arg0);

			try {
				arg0 = arg0.replace('@', '_');
				arg0 = arg0.replace('&', '_');
				arg0 = arg0.replace('#', '_');
				DataInputStream var1 = openurl("reporterror" + 225 + ".cgi?error=" + errorname + " " + arg0);
				var1.readLine();
				var1.close();
			} catch (IOException var2) {
			}
		}
	}
}
