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

public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("GHOWLKWN.c")
	public LinkList pending = new LinkList(169);

	@ObfuscatedName("GHOWLKWN.e")
	public String message = "";

	@ObfuscatedName("GHOWLKWN.h")
	public boolean _flowObfuscator2 = true;

	@ObfuscatedName("GHOWLKWN.j")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("GHOWLKWN.k")
	public byte[] buf = new byte[500];

	@ObfuscatedName("GHOWLKWN.l")
	public int _flowObfuscator3 = 923;

	@ObfuscatedName("GHOWLKWN.n")
	public byte[][] archiveFilePriorities = new byte[4][];

	@ObfuscatedName("GHOWLKWN.p")
	public LinkList prefetches = new LinkList(169);

	@ObfuscatedName("GHOWLKWN.x")
	public int _flowObfuscator5 = 13603;

	@ObfuscatedName("GHOWLKWN.y")
	public boolean running = true;

	@ObfuscatedName("GHOWLKWN.A")
	public boolean _flowObfuscator6 = false;

	@ObfuscatedName("GHOWLKWN.C")
	public boolean active = false;

	@ObfuscatedName("GHOWLKWN.D")
	public LinkList completed = new LinkList(169);

	@ObfuscatedName("GHOWLKWN.E")
	public byte[] data = new byte[65000];

	@ObfuscatedName("GHOWLKWN.G")
	public DoublyLinkList requests = new DoublyLinkList(_flowObfuscator4);

	@ObfuscatedName("GHOWLKWN.J")
	public int[][] archiveFileVersions = new int[4][];

	@ObfuscatedName("GHOWLKWN.K")
	public int[][] archiveFileChecksums = new int[4][];

	@ObfuscatedName("GHOWLKWN.N")
	public LinkList missing = new LinkList(169);

	@ObfuscatedName("GHOWLKWN.P")
	public LinkList queue = new LinkList(169);

	@ObfuscatedName("GHOWLKWN.b")
	public int totalPrefetchFiles;

	@ObfuscatedName("GHOWLKWN.d")
	public int topPriority;

	@ObfuscatedName("GHOWLKWN.f")
	public int heartbeatCycle;

	@ObfuscatedName("GHOWLKWN.m")
	public int cycle;

	@ObfuscatedName("GHOWLKWN.q")
	public static int _flowObfuscator4;

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
	public final boolean validate(int arg0, byte arg1, int arg2, byte[] arg3) {
		if (arg3 == null || arg3.length < 2) {
			return false;
		}
		int var5 = arg3.length - 2;
		int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
		if (arg1 != 3) {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		this.crc32.reset();
		this.crc32.update(arg3, 0, var5);
		int var7 = (int) this.crc32.getValue();
		if (arg0 == var6) {
			return arg2 == var7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("GHOWLKWN.b(I)V")
	public final void read(int arg0) {
		if (arg0 >= 0) {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		try {
			int var2 = this.in.available();
			if (this.partAvailable == 0 && var2 >= 6) {
				this.active = true;
				for (int var3 = 0; var3 < 6; var3 += this.in.read(this.buf, var3, 6 - var3)) {
				}
				int var4 = this.buf[0] & 0xFF;
				int var5 = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
				int var6 = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
				int var7 = this.buf[5] & 0xFF;
				this.current = null;
				for (OnDemandRequest var8 = (OnDemandRequest) this.pending.head(); var8 != null; var8 = (OnDemandRequest) this.pending.next(false)) {
					if (var8.archive == var4 && var8.file == var5) {
						this.current = var8;
					}
					if (this.current != null) {
						var8.cycle = 0;
					}
				}
				if (this.current != null) {
					this.waitCycles = 0;
					if (var6 == 0) {
						signlink.reporterror("Rej: " + var4 + "," + var5);
						this.current.data = null;
						if (this.current.important) {
							LinkList var9 = this.completed;
							synchronized (this.completed) {
								this.completed.addTail(this.current);
							}
						} else {
							this.current.unlink();
						}
						this.current = null;
					} else {
						if (this.current.data == null && var7 == 0) {
							this.current.data = new byte[var6];
						}
						if (this.current.data == null && var7 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.partOffset = var7 * 500;
				this.partAvailable = 500;
				if (this.partAvailable > var6 - var7 * 500) {
					this.partAvailable = var6 - var7 * 500;
				}
			}
			if (this.partAvailable > 0 && var2 >= this.partAvailable) {
				this.active = true;
				byte[] var10 = this.buf;
				int var11 = 0;
				if (this.current != null) {
					var10 = this.current.data;
					var11 = this.partOffset;
				}
				for (int var12 = 0; var12 < this.partAvailable; var12 += this.in.read(var10, var11 + var12, this.partAvailable - var12)) {
				}
				if (this.partAvailable + this.partOffset >= var10.length && this.current != null) {
					if (this.app.fileStreams[0] != null) {
						this.app.fileStreams[this.current.archive + 1].write(var10.length, var10, (byte) 2, this.current.file);
					}
					if (!this.current.important && this.current.archive == 3) {
						this.current.important = true;
						this.current.archive = 93;
					}
					if (this.current.important) {
						LinkList var13 = this.completed;
						synchronized (this.completed) {
							this.completed.addTail(this.current);
						}
					} else {
						this.current.unlink();
					}
				}
				this.partAvailable = 0;
			}
		} catch (IOException var18) {
			try {
				this.socket.close();
			} catch (Exception var15) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}

	@ObfuscatedName("GHOWLKWN.a(LXTGLDHGX;Lclient;)V")
	public final void load(Jagfile arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var26 = arg0.read(var3[var4], null);
			int var27 = var26.length / 2;
			Packet var28 = new Packet(var26, 891);
			this.archiveFileVersions[var4] = new int[var27];
			this.archiveFilePriorities[var4] = new byte[var27];
			for (int var29 = 0; var29 < var27; var29++) {
				this.archiveFileVersions[var4][var29] = var28.g2();
			}
		}
		String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var6 = 0; var6 < 4; var6++) {
			byte[] var22 = arg0.read(var5[var6], null);
			int var23 = var22.length / 4;
			Packet var24 = new Packet(var22, 891);
			this.archiveFileChecksums[var6] = new int[var23];
			for (int var25 = 0; var25 < var23; var25++) {
				this.archiveFileChecksums[var6][var25] = var24.g4();
			}
		}
		byte[] var7 = arg0.read("model_index", null);
		int var8 = this.archiveFileVersions[0].length;
		this.modelIndex = new byte[var8];
		for (int var9 = 0; var9 < var8; var9++) {
			if (var9 < var7.length) {
				this.modelIndex[var9] = var7[var9];
			} else {
				this.modelIndex[var9] = 0;
			}
		}
		byte[] var10 = arg0.read("map_index", null);
		Packet var11 = new Packet(var10, 891);
		int var12 = var10.length / 7;
		this.mapIndex = new int[var12];
		this.mapLand = new int[var12];
		this.mapLoc = new int[var12];
		this.mapPrefetch = new int[var12];
		for (int var13 = 0; var13 < var12; var13++) {
			this.mapIndex[var13] = var11.g2();
			this.mapLand[var13] = var11.g2();
			this.mapLoc[var13] = var11.g2();
			this.mapPrefetch[var13] = var11.g1();
		}
		byte[] var14 = arg0.read("anim_index", null);
		Packet var15 = new Packet(var14, 891);
		int var16 = var14.length / 2;
		this.animIndex = new int[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			this.animIndex[var17] = var15.g2();
		}
		byte[] var18 = arg0.read("midi_index", null);
		Packet var19 = new Packet(var18, 891);
		int var20 = var18.length;
		this.midiIndex = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.midiIndex[var21] = var19.g1();
		}
		this.app = arg1;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("GHOWLKWN.a()I")
	public final int remaining() {
		DoublyLinkList var1 = this.requests;
		synchronized (this.requests) {
		}
		int var2;
		try {
			var2 = this.requests.size();
		} catch (Throwable var5) {
			throw var5;
		}
		return var2;
	}

	@ObfuscatedName("GHOWLKWN.b()V")
	public final void stop() {
		this.running = false;
	}

	@ObfuscatedName("GHOWLKWN.a(ZI)V")
	public final void prefetchMaps(boolean arg0, int arg1) {
		int var3 = this.mapIndex.length;
		if (arg1 != 0) {
			_flowObfuscator4 = 20;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg0 || this.mapPrefetch[var4] != 0) {
				this.prefetch((byte) 2, 3, this.mapLoc[var4], (byte) 8);
				this.prefetch((byte) 2, 3, this.mapLand[var4], (byte) 8);
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.a(II)I")
	public final int getFileCount(int arg0, int arg1) {
		if (arg0 <= 0) {
			this._flowObfuscator6 = !this._flowObfuscator6;
		}
		return this.archiveFileVersions[arg1].length;
	}

	@ObfuscatedName("GHOWLKWN.a(ILPHKHJKBS;)V")
	public final void send(int arg0, OnDemandRequest arg1) {
		if (arg0 < 8 || arg0 > 8) {
			this._flowObfuscator5 = -339;
		}
		try {
			if (this.socket == null) {
				long var3 = System.currentTimeMillis();
				if (var3 - this.socketOpenTime < 4000L) {
					return;
				}
				this.socketOpenTime = var3;
				this.socket = this.app.openSocket(client.portOffset + 43594);
				this.in = this.socket.getInputStream();
				this.out = this.socket.getOutputStream();
				this.out.write(15);
				for (int var5 = 0; var5 < 8; var5++) {
					this.in.read();
				}
				this.waitCycles = 0;
			}
			this.buf[0] = (byte) arg1.archive;
			this.buf[1] = (byte) (arg1.file >> 8);
			this.buf[2] = (byte) arg1.file;
			if (arg1.important) {
				this.buf[3] = 2;
			} else if (this.app.ingame) {
				this.buf[3] = 0;
			} else {
				this.buf[3] = 1;
			}
			this.out.write(this.buf, 0, 4);
			this.heartbeatCycle = 0;
			this.failCount = -10000;
		} catch (IOException var8) {
			try {
				this.socket.close();
			} catch (Exception var7) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
			this.failCount++;
		}
	}

	@ObfuscatedName("GHOWLKWN.c(I)I")
	public final int getAnimCount(int arg0) {
		if (arg0 != 0) {
			this._flowObfuscator5 = -76;
		}
		return this.animIndex.length;
	}

	@ObfuscatedName("GHOWLKWN.b(II)V")
	public final void request(int arg0, int arg1) {
		if (arg0 < 0 || arg0 > this.archiveFileVersions.length || arg1 < 0 || arg1 > this.archiveFileVersions[arg0].length || this.archiveFileVersions[arg0][arg1] == 0) {
			return;
		}
		DoublyLinkList var3 = this.requests;
		synchronized (this.requests) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.requests.head(); var4 != null; var4 = (OnDemandRequest) this.requests.next(false)) {
				if (var4.archive == arg0 && var4.file == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.archive = arg0;
			var5.file = arg1;
			var5.important = true;
			LinkList var6 = this.queue;
			synchronized (this.queue) {
				this.queue.addTail(var5);
			}
			this.requests.addTail(var5);
		}
	}

	@ObfuscatedName("GHOWLKWN.c(II)I")
	public final int getModelFlags(int arg0, int arg1) {
		if (arg1 >= 0) {
			_flowObfuscator4 = -7;
		}
		return this.modelIndex[arg0] & 0xFF;
	}

	public final void run() {
		try {
			while (this.running) {
				this.cycle++;
				byte var1 = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.active = true;
				for (int var2 = 0; var2 < 100 && this.active; var2++) {
					this.active = false;
					this.handleQueue(true);
					this.handlePending(false);
					if (this.importantCount == 0 && var2 >= 5) {
						break;
					}
					this.handleExtras((byte) -56);
					if (this.in != null) {
						this.read(-369);
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next(false)) {
					if (var4.important) {
						var3 = true;
						var4.cycle++;
						if (var4.cycle > 50) {
							var4.cycle = 0;
							this.send(8, var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.pending.head(); var5 != null; var5 = (OnDemandRequest) this.pending.next(false)) {
						var3 = true;
						var5.cycle++;
						if (var5.cycle > 50) {
							var5.cycle = 0;
							this.send(8, var5);
						}
					}
				}
				if (var3) {
					this.waitCycles++;
					if (this.waitCycles > 750) {
						try {
							this.socket.close();
						} catch (Exception var8) {
						}
						this.socket = null;
						this.in = null;
						this.out = null;
						this.partAvailable = 0;
					}
				} else {
					this.waitCycles = 0;
					this.message = "";
				}
				if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
					this.heartbeatCycle++;
					if (this.heartbeatCycle > 500) {
						this.heartbeatCycle = 0;
						this.buf[0] = 0;
						this.buf[1] = 0;
						this.buf[2] = 0;
						this.buf[3] = 10;
						try {
							this.out.write(this.buf, 0, 4);
						} catch (IOException var7) {
							this.waitCycles = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("GHOWLKWN.a(IIZ)V")
	public final void prefetch(int arg0, int arg1, boolean arg2) {
		if (this.app.fileStreams[0] == null || (this.archiveFileVersions[arg1][arg0] == 0 || (this.archiveFilePriorities[arg1][arg0] == 0 || this.topPriority == 0))) {
			return;
		}
		OnDemandRequest var4 = new OnDemandRequest();
		var4.archive = arg1;
		var4.file = arg0;
		if (arg2) {
			_flowObfuscator4 = -423;
		}
		var4.important = false;
		LinkList var5 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.addTail(var4);
		}
	}

	@ObfuscatedName("GHOWLKWN.c()LPHKHJKBS;")
	public final OnDemandRequest poll() {
		LinkList var1 = this.completed;
		OnDemandRequest var2;
		synchronized (this.completed) {
			var2 = (OnDemandRequest) this.completed.removeHead();
		}
		if (var2 == null) {
			return null;
		}
		DoublyLinkList var3 = this.requests;
		synchronized (this.requests) {
			var2.unlink2();
		}
		if (var2.data == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
			while (true) {
				if (this.data.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.data, var4, this.data.length - var4);
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
			var2.data[var7] = this.data[var7];
		}
		return var2;
	}

	@ObfuscatedName("GHOWLKWN.a(IIII)I")
	public final int getMapFile(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 != 0) {
			return _flowObfuscator4;
		}
		int var5 = (arg3 << 8) + arg2;
		for (int var6 = 0; var6 < this.mapIndex.length; var6++) {
			if (this.mapIndex[var6] == var5) {
				if (arg0 == 0) {
					return this.mapLand[var6];
				}
				return this.mapLoc[var6];
			}
		}
		return -1;
	}

	@ObfuscatedName("GHOWLKWN.a(I)V")
	public final void requestModel(int arg0) {
		this.request(0, arg0);
	}

	@ObfuscatedName("GHOWLKWN.a(BIIB)V")
	public final void prefetch(byte arg0, int arg1, int arg2, byte arg3) {
		if (arg3 == 8) {
			boolean var5 = false;
		} else {
			this._flowObfuscator3 = 237;
		}
		if (this.app.fileStreams[0] == null || this.archiveFileVersions[arg1][arg2] == 0) {
			return;
		}
		byte[] var6 = this.app.fileStreams[arg1 + 1].read(true, arg2);
		if (this.validate(this.archiveFileVersions[arg1][arg2], (byte) 3, this.archiveFileChecksums[arg1][arg2], var6)) {
			return;
		}
		this.archiveFilePriorities[arg1][arg2] = arg0;
		if (arg0 > this.topPriority) {
			this.topPriority = arg0;
		}
		this.totalPrefetchFiles++;
	}

	@ObfuscatedName("GHOWLKWN.d(II)Z")
	public final boolean hasMapLocFile(int arg0, int arg1) {
		if (arg1 >= 0) {
			throw new NullPointerException();
		}
		for (int var3 = 0; var3 < this.mapIndex.length; var3++) {
			if (this.mapLoc[var3] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("GHOWLKWN.a(Z)V")
	public final void handlePending(boolean arg0) {
		this.importantCount = 0;
		if (arg0) {
			return;
		}
		this.requestCount = 0;
		for (OnDemandRequest var2 = (OnDemandRequest) this.pending.head(); var2 != null; var2 = (OnDemandRequest) this.pending.next(false)) {
			if (var2.important) {
				this.importantCount++;
			} else {
				this.requestCount++;
			}
		}
		while (this.importantCount < 10) {
			OnDemandRequest var3 = (OnDemandRequest) this.missing.removeHead();
			if (var3 == null) {
				break;
			}
			if (this.archiveFilePriorities[var3.archive][var3.file] != 0) {
				this.loadedPrefetchFiles++;
			}
			this.archiveFilePriorities[var3.archive][var3.file] = 0;
			this.pending.addTail(var3);
			this.importantCount++;
			this.send(8, var3);
			this.active = true;
		}
	}

	@ObfuscatedName("GHOWLKWN.d(I)V")
	public final void clearPrefetches(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		LinkList var3 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.clear();
		}
	}

	@ObfuscatedName("GHOWLKWN.b(Z)V")
	public final void handleQueue(boolean arg0) {
		if (!arg0) {
			return;
		}
		LinkList var2 = this.queue;
		OnDemandRequest var3;
		synchronized (this.queue) {
			var3 = (OnDemandRequest) this.queue.removeHead();
		}
		while (var3 != null) {
			this.active = true;
			byte[] var4 = null;
			if (this.app.fileStreams[0] != null) {
				var4 = this.app.fileStreams[var3.archive + 1].read(true, var3.file);
			}
			if (!this.validate(this.archiveFileVersions[var3.archive][var3.file], (byte) 3, this.archiveFileChecksums[var3.archive][var3.file], var4)) {
				var4 = null;
			}
			LinkList var5 = this.queue;
			synchronized (this.queue) {
				if (var4 == null) {
					this.missing.addTail(var3);
				} else {
					var3.data = var4;
					LinkList var6 = this.completed;
					synchronized (this.completed) {
						this.completed.addTail(var3);
					}
				}
				var3 = (OnDemandRequest) this.queue.removeHead();
			}
		}
	}

	@ObfuscatedName("GHOWLKWN.a(B)V")
	public final void handleExtras(byte arg0) {
		if (arg0 != -56) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		while (this.importantCount == 0) {
			if (this.requestCount >= 10 || this.topPriority == 0) {
				return;
			}
			LinkList var3 = this.prefetches;
			OnDemandRequest var4;
			synchronized (this.prefetches) {
				var4 = (OnDemandRequest) this.prefetches.removeHead();
			}
			while (var4 != null) {
				if (this.archiveFilePriorities[var4.archive][var4.file] != 0) {
					this.archiveFilePriorities[var4.archive][var4.file] = 0;
					this.pending.addTail(var4);
					this.send(8, var4);
					this.active = true;
					if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
						this.loadedPrefetchFiles++;
					}
					this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
					this.requestCount++;
					if (this.requestCount == 10) {
						return;
					}
				}
				LinkList var5 = this.prefetches;
				synchronized (this.prefetches) {
					var4 = (OnDemandRequest) this.prefetches.removeHead();
				}
			}
			for (int var6 = 0; var6 < 4; var6++) {
				byte[] var7 = this.archiveFilePriorities[var6];
				int var8 = var7.length;
				for (int var9 = 0; var9 < var8; var9++) {
					if (var7[var9] == this.topPriority) {
						var7[var9] = 0;
						OnDemandRequest var10 = new OnDemandRequest();
						var10.archive = var6;
						var10.file = var9;
						var10.important = false;
						this.pending.addTail(var10);
						this.send(8, var10);
						this.active = true;
						if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
							this.loadedPrefetchFiles++;
						}
						this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
						this.requestCount++;
						if (this.requestCount == 10) {
							return;
						}
					}
				}
			}
			this.topPriority--;
		}
	}

	@ObfuscatedName("GHOWLKWN.e(II)Z")
	public final boolean shouldPrefetchMidi(int arg0, int arg1) {
		if (arg1 != 5) {
			_flowObfuscator4 = 169;
		}
		return this.midiIndex[arg0] == 1;
	}
}
