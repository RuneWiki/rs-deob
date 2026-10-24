package sign;

import java.applet.Applet;
import java.io.DataInputStream;
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

	public static String midi = null;

	public static String jingle = null;

	public static int jinglelen = 3500;

	public static int looprate = 100;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final int clientversion = 194;

	public static int socketreq;

	public static Applet mainapp;

	public static InetAddress socketip;

	public static boolean active;

	public static boolean sunjava;

	public static final void startpriv(InetAddress arg0) {
		if (!active) {
			socketip = arg0;
			Thread var1 = new Thread(new signlink());
			var1.setDaemon(true);
			var1.start();
		}
	}

	public final void run() {
		if (!active) {
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
					Thread.sleep(looprate);
				} catch (Exception var12) {
				}
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

	public static final byte[] cacheload(String arg0) {
		if (!active) {
			return null;
		}

		if (loadreq == null) {
			loadreq = String.valueOf(gethash(arg0));
			while (loadreq != null) {
				try {
					Thread.sleep(1L);
				} catch (Exception var1) {
				}
			}

			return loadbuf;
		}

		return null;
	}

	public static final void cachesave(String arg0, byte[] arg1) {
		if (active && (savereq == null && arg1.length <= 2000000)) {
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

	public static final String dnslookup(String arg0) {
		return "unknown";
	}

	public static final void startthread(Runnable arg0, int arg1) {
		threadreqpri = arg1;
		threadreq = arg0;
	}

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

	public static final void reporterror(String arg0) {
		if (reporterror) {
			System.out.println("Error: " + arg0);

			try {
				arg0 = arg0.replace('@', '_');
				arg0 = arg0.replace('&', '_');
				arg0 = arg0.replace('#', '_');
				DataInputStream var1 = openurl("reporterror" + 194 + ".cgi?error=" + errorname + " " + arg0);
				var1.readLine();
				var1.close();
			} catch (IOException var2) {
			}
		}
	}
}
