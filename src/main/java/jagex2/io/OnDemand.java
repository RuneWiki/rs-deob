package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.LinkList2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("vb")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("vb.g")
	public int[][] versions = new int[4][];

	@ObfuscatedName("vb.h")
	public int[][] crcs = new int[4][];

	@ObfuscatedName("vb.i")
	public byte[][] priorities = new byte[4][];

	@ObfuscatedName("vb.j")
	public int topPriority;

	@ObfuscatedName("vb.k")
	public byte[] modelUse;

	@ObfuscatedName("vb.l")
	public int[] mapIndex;

	@ObfuscatedName("vb.m")
	public int[] mapLand;

	@ObfuscatedName("vb.n")
	public int[] mapLoc;

	@ObfuscatedName("vb.o")
	public int[] mapFree;

	@ObfuscatedName("vb.p")
	public int[] animFrameIndex;

	@ObfuscatedName("vb.q")
	public int[] midiJingle;

	@ObfuscatedName("vb.r")
	public boolean running = true;

	@ObfuscatedName("vb.s")
	public Client app;

	@ObfuscatedName("vb.t")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("vb.u")
	public boolean active = false;

	@ObfuscatedName("vb.v")
	public int urgentCount;

	@ObfuscatedName("vb.w")
	public int requestCount;

	@ObfuscatedName("vb.x")
	public LinkList2 requests = new LinkList2();

	@ObfuscatedName("vb.y")
	public LinkList queue = new LinkList();

	@ObfuscatedName("vb.z")
	public LinkList missing = new LinkList();

	@ObfuscatedName("vb.A")
	public LinkList pending = new LinkList();

	@ObfuscatedName("vb.B")
	public LinkList completed = new LinkList();

	@ObfuscatedName("vb.C")
	public LinkList prefetches = new LinkList();

	@ObfuscatedName("vb.D")
	public String message = "";

	@ObfuscatedName("vb.M")
	public byte[] buf = new byte[500];

	@ObfuscatedName("vb.N")
	public byte[] data = new byte[65000];

	@ObfuscatedName("vb.E")
	public int loadedPrefetchFiles;

	@ObfuscatedName("vb.F")
	public int totalPrefetchFiles;

	@ObfuscatedName("vb.K")
	public int partOffset;

	@ObfuscatedName("vb.L")
	public int partAvailable;

	@ObfuscatedName("vb.O")
	public int packetCycle;

	@ObfuscatedName("vb.P")
	public int noTimeoutCycle;

	@ObfuscatedName("vb.R")
	public int cycle;

	@ObfuscatedName("vb.Q")
	public long socketOpenTime;

	@ObfuscatedName("vb.J")
	public OnDemandRequest current;

	@ObfuscatedName("vb.H")
	public InputStream in;

	@ObfuscatedName("vb.I")
	public OutputStream out;

	@ObfuscatedName("vb.G")
	public Socket socket;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void init(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.read(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5);
			versions[var4] = new int[var6];
			priorities[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				versions[var4][var8] = var7.g2();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.read(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11);
			crcs[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				crcs[var10][var14] = var13.g4();
			}
		}

		byte[] var15 = arg0.read("model_index", null);
		int var16 = versions[0].length;
		modelUse = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				modelUse[var17] = var15[var17];
			} else {
				modelUse[var17] = 0;
			}
		}

		byte[] var18 = arg0.read("map_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length / 7;
		mapIndex = new int[var20];
		mapLand = new int[var20];
		mapLoc = new int[var20];
		mapFree = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			mapIndex[var21] = var19.g2();
			mapLand[var21] = var19.g2();
			mapLoc[var21] = var19.g2();
			mapFree[var21] = var19.g1();
		}

		byte[] var22 = arg0.read("anim_index", null);
		Packet var23 = new Packet(var22);
		int var24 = var22.length / 2;
		animFrameIndex = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			animFrameIndex[var25] = var23.g2();
		}

		byte[] var26 = arg0.read("midi_index", null);
		Packet var27 = new Packet(var26);
		int var28 = var26.length;
		midiJingle = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			midiJingle[var29] = var27.g1();
		}

		app = arg1;
		running = true;
		app.startThread(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void stop() {
		running = false;
	}

	@ObfuscatedName("vb.a(IB)I")
	public final int getFileCount(int arg0) {
		return versions[arg0].length;
	}

	@ObfuscatedName("vb.a(Z)I")
	public final int getAnimFrameCount() {
		return animFrameIndex.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int getMapFile(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < mapIndex.length; var5++) {
			if (mapIndex[var5] == var4) {
				if (arg2 == 0) {
					return mapLand[var5];
				}

				return mapLoc[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(IZ)V")
	public final void prefetchMaps(boolean arg0) {
		int var2 = mapIndex.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || mapFree[var3] != 0) {
				prefetchPriority(3, (byte) 2, mapLoc[var3]);
				prefetchPriority(3, (byte) 2, mapLand[var3]);
			}
		}
	}

	@ObfuscatedName("vb.b(IB)Z")
	public final boolean hasMapLocFile(int arg0) {
		for (int var2 = 0; var2 < mapIndex.length; var2++) {
			if (mapLoc[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.a(BI)I")
	public final int getModelUse(int arg0) {
		return modelUse[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.b(IZ)Z")
	public final boolean isMidiJingle(int arg0) {
		if (midiJingle[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void requestModel(int arg0) {
		request(0, arg0);
	}

	@ObfuscatedName("vb.a(II)V")
	public final void request(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= versions.length && arg1 >= 0 && arg1 <= versions[arg0].length && versions[arg0][arg1] != 0) {
			synchronized (requests) {
				for (OnDemandRequest var4 = (OnDemandRequest) requests.head(); var4 != null; var4 = (OnDemandRequest) requests.next()) {
					if (var4.archive == arg0 && var4.file == arg1) {
						return;
					}
				}

				OnDemandRequest var5 = new OnDemandRequest();
				var5.archive = arg0;
				var5.file = arg1;
				var5.urgent = true;

				synchronized (queue) {
					queue.push(var5);
				}

				requests.push(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int remaining() {
		synchronized (requests) {
			return requests.size();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final OnDemandRequest loop() {
		OnDemandRequest var2;
		synchronized (completed) {
			var2 = (OnDemandRequest) completed.popFront();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (requests) {
			var2.unlink2();
		}

		if (var2.data == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
			while (true) {
				if (data.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(data, var4, data.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.data = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.data[var7] = data[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IIBI)V")
	public final void prefetchPriority(int arg0, byte arg1, int arg2) {
		if (app.fileStreams[0] != null && versions[arg0][arg2] != 0) {
			byte[] var4 = app.fileStreams[arg0 + 1].readFromFile(arg2);
			if (!validate(var4, versions[arg0][arg2], crcs[arg0][arg2])) {
				priorities[arg0][arg2] = arg1;

				if (arg1 > topPriority) {
					topPriority = arg1;
				}

				totalPrefetchFiles++;
			}
		}
	}

	@ObfuscatedName("vb.b(I)V")
	public final void clearPrefetches() {
		synchronized (prefetches) {
			prefetches.clear();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void prefetch(int arg0, int arg1) {
		if (app.fileStreams[0] != null && (versions[arg0][arg1] != 0 && (priorities[arg0][arg1] != 0 && topPriority != 0))) {
			OnDemandRequest var3 = new OnDemandRequest();
			var3.archive = arg0;
			var3.file = arg1;
			var3.urgent = false;

			synchronized (prefetches) {
				prefetches.push(var3);
			}
		}
	}

	public final void run() {
		try {
			while (running) {
				cycle++;
				byte var1 = 20;
				if (topPriority == 0 && app.fileStreams[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				active = true;
				for (int var2 = 0; var2 < 100 && active; var2++) {
					active = false;
					handleQueue();
					handlePending();

					if (urgentCount == 0 && var2 >= 5) {
						break;
					}

					handleExtra();

					if (in != null) {
						read();
					}
				}

				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) pending.head(); var4 != null; var4 = (OnDemandRequest) pending.next()) {
					if (var4.urgent) {
						var3 = true;
						var4.cycle++;
						if (var4.cycle > 50) {
							var4.cycle = 0;
							send(var4);
						}
					}
				}

				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) pending.head(); var5 != null; var5 = (OnDemandRequest) pending.next()) {
						var3 = true;
						var5.cycle++;
						if (var5.cycle > 50) {
							var5.cycle = 0;
							send(var5);
						}
					}
				}

				if (var3) {
					packetCycle++;
					if (packetCycle > 750) {
						try {
							socket.close();
						} catch (Exception var8) {
						}

						socket = null;
						in = null;
						out = null;
						partAvailable = 0;
					}
				} else {
					packetCycle = 0;
					message = "";
				}

				if (app.ingame && socket != null && out != null && (topPriority > 0 || app.fileStreams[0] == null)) {
					noTimeoutCycle++;
					if (noTimeoutCycle > 500) {
						noTimeoutCycle = 0;
						buf[0] = 0;
						buf[1] = 0;
						buf[2] = 0;
						buf[3] = 10;
						try {
							out.write(buf, 0, 4);
						} catch (IOException var7) {
							packetCycle = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void handleQueue() {
		OnDemandRequest var2;
		synchronized (queue) {
			var2 = (OnDemandRequest) queue.popFront();
		}

		while (var2 != null) {
			active = true;
			byte[] var3 = null;
			if (app.fileStreams[0] != null) {
				var3 = app.fileStreams[var2.archive + 1].readFromFile(var2.file);
			}

			if (!validate(var3, versions[var2.archive][var2.file], crcs[var2.archive][var2.file])) {
				var3 = null;
			}

			synchronized (queue) {
				if (var3 == null) {
					missing.push(var2);
				} else {
					var2.data = var3;

					synchronized (completed) {
						completed.push(var2);
					}
				}

				var2 = (OnDemandRequest) queue.popFront();
			}
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void handlePending() {
		urgentCount = 0;
		requestCount = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) pending.head(); var1 != null; var1 = (OnDemandRequest) pending.next()) {
			if (var1.urgent) {
				urgentCount++;
			} else {
				requestCount++;
			}
		}

		while (urgentCount < 10) {
			OnDemandRequest var2 = (OnDemandRequest) missing.popFront();
			if (var2 == null) {
				break;
			}

			if (priorities[var2.archive][var2.file] != 0) {
				loadedPrefetchFiles++;
			}

			priorities[var2.archive][var2.file] = 0;
			pending.push(var2);
			urgentCount++;
			send(var2);
			active = true;
		}
	}

	@ObfuscatedName("vb.b(Z)V")
	public final void handleExtra() {
		while (urgentCount == 0) {
			if (requestCount >= 10 || topPriority == 0) {
				return;
			}

			OnDemandRequest var2;
			synchronized (prefetches) {
				var2 = (OnDemandRequest) prefetches.popFront();
			}

			while (var2 != null) {
				if (priorities[var2.archive][var2.file] != 0) {
					priorities[var2.archive][var2.file] = 0;
					pending.push(var2);
					send(var2);
					active = true;

					if (loadedPrefetchFiles < totalPrefetchFiles) {
						loadedPrefetchFiles++;
					}

					message = "Loading extra files - " + loadedPrefetchFiles * 100 / totalPrefetchFiles + "%";
					requestCount++;
					if (requestCount == 10) {
						return;
					}
				}

				synchronized (prefetches) {
					var2 = (OnDemandRequest) prefetches.popFront();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = priorities[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == topPriority) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.archive = var4;
						var8.file = var7;
						var8.urgent = false;
						pending.push(var8);
						send(var8);
						active = true;

						if (loadedPrefetchFiles < totalPrefetchFiles) {
							loadedPrefetchFiles++;
						}

						message = "Loading extra files - " + loadedPrefetchFiles * 100 / totalPrefetchFiles + "%";
						requestCount++;
						if (requestCount == 10) {
							return;
						}
					}
				}
			}

			topPriority--;
		}
	}

	@ObfuscatedName("vb.e(I)V")
	public final void read() {
		try {
			int var1 = in.available();
			if (partAvailable == 0 && var1 >= 6) {
				active = true;

				for (int var2 = 0; var2 < 6; var2 += in.read(buf, var2, 6 - var2)) {
				}

				int var3 = buf[0] & 0xFF;
				int var4 = ((buf[1] & 0xFF) << 8) + (buf[2] & 0xFF);
				int var5 = ((buf[3] & 0xFF) << 8) + (buf[4] & 0xFF);
				int var6 = buf[5] & 0xFF;
				current = null;
				for (OnDemandRequest var7 = (OnDemandRequest) pending.head(); var7 != null; var7 = (OnDemandRequest) pending.next()) {
					if (var7.archive == var3 && var7.file == var4) {
						current = var7;
					}

					if (current != null) {
						var7.cycle = 0;
					}
				}

				if (current != null) {
					packetCycle = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						current.data = null;

						if (current.urgent) {
							synchronized (completed) {
								completed.push(current);
							}
						} else {
							current.unlink();
						}

						current = null;
					} else {
						if (current.data == null && var6 == 0) {
							current.data = new byte[var5];
						}

						if (current.data == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				partOffset = var6 * 500;
				partAvailable = 500;
				if (partAvailable > var5 - var6 * 500) {
					partAvailable = var5 - var6 * 500;
				}
			}

			if (partAvailable > 0 && var1 >= partAvailable) {
				active = true;
				byte[] var9 = buf;
				int var10 = 0;
				if (current != null) {
					var9 = current.data;
					var10 = partOffset;
				}

				for (int var11 = 0; var11 < partAvailable; var11 += in.read(var9, var10 + var11, partAvailable - var11)) {
				}

				if (partAvailable + partOffset >= var9.length && current != null) {
					if (app.fileStreams[0] != null) {
						app.fileStreams[current.archive + 1].writeToFile(var9.length, current.file, var9);
					}

					if (!current.urgent && current.archive == 3) {
						current.urgent = true;
						current.archive = 93;
					}

					if (current.urgent) {
						synchronized (completed) {
							completed.push(current);
						}
					} else {
						current.unlink();
					}
				}

				partAvailable = 0;
			}
		} catch (IOException var17) {
			try {
				socket.close();
			} catch (Exception var14) {
			}

			socket = null;
			in = null;
			out = null;
			partAvailable = 0;
		}
	}

	@ObfuscatedName("vb.a([BIZI)Z")
	public final boolean validate(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			crc32.reset();
			crc32.update(arg0, 0, var4);
			int var6 = (int) crc32.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg2 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(Lnb;I)V")
	public final void send(OnDemandRequest arg0) {
		try {
			if (socket == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - socketOpenTime < 5000L) {
					return;
				}

				socketOpenTime = var2;
				socket = app.openSocket(Client.portOffset + 43594);
				in = socket.getInputStream();
				out = socket.getOutputStream();
				out.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					in.read();
				}

				packetCycle = 0;
			}

			buf[0] = (byte) arg0.archive;
			buf[1] = (byte) (arg0.file >> 8);
			buf[2] = (byte) arg0.file;
			if (arg0.urgent) {
				buf[3] = 2;
			} else if (app.ingame) {
				buf[3] = 0;
			} else {
				buf[3] = 1;
			}

			out.write(buf, 0, 4);
			noTimeoutCycle = 0;
		} catch (IOException var7) {
			try {
				socket.close();
			} catch (Exception var6) {
			}

			socket = null;
			in = null;
			out = null;
			partAvailable = 0;
		}
	}
}
