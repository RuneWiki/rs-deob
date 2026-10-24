package jagex2.io;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("GHOWLKWN")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("GHOWLKWN.c")
	public LinkList pending = new LinkList();

	@ObfuscatedName("GHOWLKWN.e")
	public String message = "";

	@ObfuscatedName("GHOWLKWN.j")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("GHOWLKWN.k")
	public byte[] buf = new byte[500];

	@ObfuscatedName("GHOWLKWN.n")
	public byte[][] archiveFilePriorities = new byte[4][];

	@ObfuscatedName("GHOWLKWN.p")
	public LinkList prefetches = new LinkList();

	@ObfuscatedName("GHOWLKWN.y")
	public boolean running = true;

	@ObfuscatedName("GHOWLKWN.C")
	public boolean active = false;

	@ObfuscatedName("GHOWLKWN.D")
	public LinkList completed = new LinkList();

	@ObfuscatedName("GHOWLKWN.E")
	public byte[] data = new byte[65000];

	@ObfuscatedName("GHOWLKWN.G")
	public DoublyLinkList requests = new DoublyLinkList();

	@ObfuscatedName("GHOWLKWN.J")
	public int[][] archiveFileVersions = new int[4][];

	@ObfuscatedName("GHOWLKWN.K")
	public int[][] archiveFileChecksums = new int[4][];

	@ObfuscatedName("GHOWLKWN.N")
	public LinkList missing = new LinkList();

	@ObfuscatedName("GHOWLKWN.P")
	public LinkList queue = new LinkList();

	@ObfuscatedName("GHOWLKWN.b")
	public int totalPrefetchFiles;

	@ObfuscatedName("GHOWLKWN.d")
	public int topPriority;

	@ObfuscatedName("GHOWLKWN.f")
	public int heartbeatCycle;

	@ObfuscatedName("GHOWLKWN.m")
	public int cycle;

	@ObfuscatedName("GHOWLKWN.r")
	public int partOffset;

	@ObfuscatedName("GHOWLKWN.s")
	public int partAvailable;

	@ObfuscatedName("GHOWLKWN.u")
	public int failCount;

	@ObfuscatedName("GHOWLKWN.w")
	public int loadedPrefetchFiles;

	@ObfuscatedName("GHOWLKWN.L")
	public int importantCount;

	@ObfuscatedName("GHOWLKWN.M")
	public int requestCount;

	@ObfuscatedName("GHOWLKWN.S")
	public int waitCycles;

	@ObfuscatedName("GHOWLKWN.g")
	public long socketOpenTime;

	@ObfuscatedName("GHOWLKWN.O")
	public OnDemandRequest current;

	@ObfuscatedName("GHOWLKWN.o")
	public client app;

	@ObfuscatedName("GHOWLKWN.H")
	public InputStream in;

	@ObfuscatedName("GHOWLKWN.z")
	public OutputStream out;

	@ObfuscatedName("GHOWLKWN.I")
	public Socket socket;

	@ObfuscatedName("GHOWLKWN.R")
	public byte[] modelIndex;

	@ObfuscatedName("GHOWLKWN.i")
	public int[] mapLoc;

	@ObfuscatedName("GHOWLKWN.t")
	public int[] midiIndex;

	@ObfuscatedName("GHOWLKWN.v")
	public int[] mapLand;

	@ObfuscatedName("GHOWLKWN.B")
	public int[] mapPrefetch;

	@ObfuscatedName("GHOWLKWN.F")
	public int[] animIndex;

	@ObfuscatedName("GHOWLKWN.Q")
	public int[] mapIndex;

	@ObfuscatedName("GHOWLKWN.a(IBI[B)Z")
	public final boolean validate(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			crc32.reset();
			crc32.update(arg2, 0, var4);
			int var6 = (int) crc32.getValue();

			if (arg0 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("GHOWLKWN.b(I)V")
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
					waitCycles = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						current.data = null;

						if (current.important) {
							synchronized (completed) {
								completed.addTail(current);
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
						app.fileStreams[current.archive + 1].write(var9.length, var9, current.file);
					}

					if (!current.important && current.archive == 3) {
						current.important = true;
						current.archive = 93;
					}

					if (current.important) {
						synchronized (completed) {
							completed.addTail(current);
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

	@ObfuscatedName("GHOWLKWN.a(LXTGLDHGX;Lclient;)V")
	public final void load(Jagfile arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.read(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5);
			archiveFileVersions[var4] = new int[var6];
			archiveFilePriorities[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				archiveFileVersions[var4][var8] = var7.g2();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.read(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11);
			archiveFileChecksums[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				archiveFileChecksums[var10][var14] = var13.g4();
			}
		}

		byte[] var15 = arg0.read("model_index", null);
		int var16 = archiveFileVersions[0].length;
		modelIndex = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				modelIndex[var17] = var15[var17];
			} else {
				modelIndex[var17] = 0;
			}
		}

		byte[] var18 = arg0.read("map_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length / 7;
		mapIndex = new int[var20];
		mapLand = new int[var20];
		mapLoc = new int[var20];
		mapPrefetch = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			mapIndex[var21] = var19.g2();
			mapLand[var21] = var19.g2();
			mapLoc[var21] = var19.g2();
			mapPrefetch[var21] = var19.g1();
		}

		byte[] var22 = arg0.read("anim_index", null);
		Packet var23 = new Packet(var22);
		int var24 = var22.length / 2;
		animIndex = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			animIndex[var25] = var23.g2();
		}

		byte[] var26 = arg0.read("midi_index", null);
		Packet var27 = new Packet(var26);
		int var28 = var26.length;
		midiIndex = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			midiIndex[var29] = var27.g1();
		}

		app = arg1;
		running = true;
		app.startThread(this, 2);
	}

	@ObfuscatedName("GHOWLKWN.a()I")
	public final int remaining() {
		synchronized (requests) {
			return requests.size();
		}
	}

	@ObfuscatedName("GHOWLKWN.b()V")
	public final void stop() {
		running = false;
	}

	@ObfuscatedName("GHOWLKWN.a(ZI)V")
	public final void prefetchMaps(boolean arg0) {
		int var2 = mapIndex.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || mapPrefetch[var3] != 0) {
				prefetch((byte) 2, 3, mapLoc[var3]);
				prefetch((byte) 2, 3, mapLand[var3]);
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.a(II)I")
	public final int getFileCount(int arg0) {
		return archiveFileVersions[arg0].length;
	}

	@ObfuscatedName("GHOWLKWN.a(ILPHKHJKBS;)V")
	public final void send(OnDemandRequest arg0) {
		try {
			if (socket == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - socketOpenTime < 4000L) {
					return;
				}

				socketOpenTime = var2;
				socket = app.openSocket(client.portOffset + 43594);
				in = socket.getInputStream();
				out = socket.getOutputStream();
				out.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					in.read();
				}

				waitCycles = 0;
			}

			buf[0] = (byte) arg0.archive;
			buf[1] = (byte) (arg0.file >> 8);
			buf[2] = (byte) arg0.file;
			if (arg0.important) {
				buf[3] = 2;
			} else if (app.ingame) {
				buf[3] = 0;
			} else {
				buf[3] = 1;
			}

			out.write(buf, 0, 4);
			heartbeatCycle = 0;
			failCount = -10000;
		} catch (IOException var7) {
			try {
				socket.close();
			} catch (Exception var6) {
			}

			socket = null;
			in = null;
			out = null;
			partAvailable = 0;
			failCount++;
		}
	}

	@ObfuscatedName("GHOWLKWN.c(I)I")
	public final int getAnimCount() {
		return animIndex.length;
	}

	@ObfuscatedName("GHOWLKWN.b(II)V")
	public final void request(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= archiveFileVersions.length && arg1 >= 0 && arg1 <= archiveFileVersions[arg0].length && archiveFileVersions[arg0][arg1] != 0) {
			synchronized (requests) {
				for (OnDemandRequest var4 = (OnDemandRequest) requests.head(); var4 != null; var4 = (OnDemandRequest) requests.next()) {
					if (var4.archive == arg0 && var4.file == arg1) {
						return;
					}
				}

				OnDemandRequest var5 = new OnDemandRequest();
				var5.archive = arg0;
				var5.file = arg1;
				var5.important = true;

				synchronized (queue) {
					queue.addTail(var5);
				}

				requests.addTail(var5);
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.c(II)I")
	public final int getModelFlags(int arg0) {
		return modelIndex[arg0] & 0xFF;
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

					if (importantCount == 0 && var2 >= 5) {
						break;
					}

					handleExtras();

					if (in != null) {
						read();
					}
				}

				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) pending.head(); var4 != null; var4 = (OnDemandRequest) pending.next()) {
					if (var4.important) {
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
					waitCycles++;
					if (waitCycles > 750) {
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
					waitCycles = 0;
					message = "";
				}

				if (app.ingame && socket != null && out != null && (topPriority > 0 || app.fileStreams[0] == null)) {
					heartbeatCycle++;
					if (heartbeatCycle > 500) {
						heartbeatCycle = 0;
						buf[0] = 0;
						buf[1] = 0;
						buf[2] = 0;
						buf[3] = 10;
						try {
							out.write(buf, 0, 4);
						} catch (IOException var7) {
							waitCycles = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("GHOWLKWN.a(IIZ)V")
	public final void prefetch(int arg0, int arg1) {
		if (app.fileStreams[0] != null && (archiveFileVersions[arg1][arg0] != 0 && (archiveFilePriorities[arg1][arg0] != 0 && topPriority != 0))) {
			OnDemandRequest var3 = new OnDemandRequest();
			var3.archive = arg1;
			var3.file = arg0;
			var3.important = false;

			synchronized (prefetches) {
				prefetches.addTail(var3);
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.c()LPHKHJKBS;")
	public final OnDemandRequest poll() {
		OnDemandRequest var2;
		synchronized (completed) {
			var2 = (OnDemandRequest) completed.removeHead();
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

	@ObfuscatedName("GHOWLKWN.a(IIII)I")
	public final int getMapFile(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < mapIndex.length; var5++) {
			if (mapIndex[var5] == var4) {
				if (arg0 == 0) {
					return mapLand[var5];
				}

				return mapLoc[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("GHOWLKWN.a(I)V")
	public final void requestModel(int arg0) {
		request(0, arg0);
	}

	@ObfuscatedName("GHOWLKWN.a(BIIB)V")
	public final void prefetch(byte arg0, int arg1, int arg2) {
		if (app.fileStreams[0] != null && archiveFileVersions[arg1][arg2] != 0) {
			byte[] var4 = app.fileStreams[arg1 + 1].read(arg2);
			if (!validate(archiveFileVersions[arg1][arg2], archiveFileChecksums[arg1][arg2], var4)) {
				archiveFilePriorities[arg1][arg2] = arg0;

				if (arg0 > topPriority) {
					topPriority = arg0;
				}

				totalPrefetchFiles++;
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.d(II)Z")
	public final boolean hasMapLocFile(int arg0) {
		for (int var2 = 0; var2 < mapIndex.length; var2++) {
			if (mapLoc[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GHOWLKWN.a(Z)V")
	public final void handlePending() {
		importantCount = 0;
		requestCount = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) pending.head(); var1 != null; var1 = (OnDemandRequest) pending.next()) {
			if (var1.important) {
				importantCount++;
			} else {
				requestCount++;
			}
		}

		while (importantCount < 10) {
			OnDemandRequest var2 = (OnDemandRequest) missing.removeHead();
			if (var2 == null) {
				break;
			}

			if (archiveFilePriorities[var2.archive][var2.file] != 0) {
				loadedPrefetchFiles++;
			}

			archiveFilePriorities[var2.archive][var2.file] = 0;
			pending.addTail(var2);
			importantCount++;
			send(var2);
			active = true;
		}
	}

	@ObfuscatedName("GHOWLKWN.d(I)V")
	public final void clearPrefetches() {
		synchronized (prefetches) {
			prefetches.clear();
		}
	}

	@ObfuscatedName("GHOWLKWN.b(Z)V")
	public final void handleQueue() {
		OnDemandRequest var2;
		synchronized (queue) {
			var2 = (OnDemandRequest) queue.removeHead();
		}

		while (var2 != null) {
			active = true;
			byte[] var3 = null;
			if (app.fileStreams[0] != null) {
				var3 = app.fileStreams[var2.archive + 1].read(var2.file);
			}

			if (!validate(archiveFileVersions[var2.archive][var2.file], archiveFileChecksums[var2.archive][var2.file], var3)) {
				var3 = null;
			}

			synchronized (queue) {
				if (var3 == null) {
					missing.addTail(var2);
				} else {
					var2.data = var3;

					synchronized (completed) {
						completed.addTail(var2);
					}
				}

				var2 = (OnDemandRequest) queue.removeHead();
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.a(B)V")
	public final void handleExtras() {
		while (importantCount == 0) {
			if (requestCount >= 10 || topPriority == 0) {
				return;
			}

			OnDemandRequest var2;
			synchronized (prefetches) {
				var2 = (OnDemandRequest) prefetches.removeHead();
			}

			while (var2 != null) {
				if (archiveFilePriorities[var2.archive][var2.file] != 0) {
					archiveFilePriorities[var2.archive][var2.file] = 0;
					pending.addTail(var2);
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
					var2 = (OnDemandRequest) prefetches.removeHead();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = archiveFilePriorities[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == topPriority) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.archive = var4;
						var8.file = var7;
						var8.important = false;
						pending.addTail(var8);
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

	@ObfuscatedName("GHOWLKWN.e(II)Z")
	public final boolean shouldPrefetchMidi(int arg0) {
		if (midiIndex[arg0] == 1) {
			return true;
		}

		return false;
	}
}
