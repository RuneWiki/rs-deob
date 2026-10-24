package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
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

@ObfuscatedName("ZPGPWCCV")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ZPGPWCCV.e")
	public byte[][] field1465 = new byte[4][];

	@ObfuscatedName("ZPGPWCCV.f")
	public boolean field1466 = false;

	@ObfuscatedName("ZPGPWCCV.g")
	public boolean field1467 = true;

	@ObfuscatedName("ZPGPWCCV.h")
	public LinkList field1468 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.l")
	public int[][] field1472 = new int[4][];

	@ObfuscatedName("ZPGPWCCV.o")
	public String field1474 = "";

	@ObfuscatedName("ZPGPWCCV.s")
	public LinkList field1478 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.v")
	public CRC32 field1480 = new CRC32();

	@ObfuscatedName("ZPGPWCCV.y")
	public LinkList field1482 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.z")
	public LinkList field1483 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.A")
	public byte[] field1484 = new byte[65000];

	@ObfuscatedName("ZPGPWCCV.F")
	public byte[] field1488 = new byte[500];

	@ObfuscatedName("ZPGPWCCV.K")
	public DoublyLinkList field1491 = new DoublyLinkList();

	@ObfuscatedName("ZPGPWCCV.P")
	public LinkList field1495 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.S")
	public int[][] field1498 = new int[4][];

	@ObfuscatedName("ZPGPWCCV.b")
	public int field1462;

	@ObfuscatedName("ZPGPWCCV.i")
	public int field1469;

	@ObfuscatedName("ZPGPWCCV.j")
	public int field1470;

	@ObfuscatedName("ZPGPWCCV.k")
	public int field1471;

	@ObfuscatedName("ZPGPWCCV.p")
	public int field1475;

	@ObfuscatedName("ZPGPWCCV.r")
	public int field1477;

	@ObfuscatedName("ZPGPWCCV.u")
	public int field1479;

	@ObfuscatedName("ZPGPWCCV.C")
	public int field1486;

	@ObfuscatedName("ZPGPWCCV.D")
	public int field1487;

	@ObfuscatedName("ZPGPWCCV.Q")
	public int field1496;

	@ObfuscatedName("ZPGPWCCV.U")
	public int field1500;

	@ObfuscatedName("ZPGPWCCV.T")
	public long field1499;

	@ObfuscatedName("ZPGPWCCV.N")
	public OnDemandRequest field1493;

	@ObfuscatedName("ZPGPWCCV.O")
	public Client field1494;

	@ObfuscatedName("ZPGPWCCV.L")
	public InputStream field1492;

	@ObfuscatedName("ZPGPWCCV.q")
	public OutputStream field1476;

	@ObfuscatedName("ZPGPWCCV.w")
	public Socket field1481;

	@ObfuscatedName("ZPGPWCCV.c")
	public byte[] field1463;

	@ObfuscatedName("ZPGPWCCV.d")
	public int[] field1464;

	@ObfuscatedName("ZPGPWCCV.n")
	public int[] field1473;

	@ObfuscatedName("ZPGPWCCV.B")
	public int[] field1485;

	@ObfuscatedName("ZPGPWCCV.G")
	public int[] field1489;

	@ObfuscatedName("ZPGPWCCV.H")
	public int[] field1490;

	@ObfuscatedName("ZPGPWCCV.R")
	public int[] field1497;

	@ObfuscatedName("ZPGPWCCV.a(Z)V")
	public final void method581() {
		try {
			int var1 = field1492.available();
			if (field1487 == 0 && var1 >= 6) {
				field1466 = true;

				for (int var2 = 0; var2 < 6; var2 += field1492.read(field1488, var2, 6 - var2)) {
				}

				int var3 = field1488[0] & 0xFF;
				int var4 = ((field1488[1] & 0xFF) << 8) + (field1488[2] & 0xFF);
				int var5 = ((field1488[3] & 0xFF) << 8) + (field1488[4] & 0xFF);
				int var6 = field1488[5] & 0xFF;
				field1493 = null;
				for (OnDemandRequest var7 = (OnDemandRequest) field1495.method6(); var7 != null; var7 = (OnDemandRequest) field1495.method8()) {
					if (var7.field1178 == var3 && var7.field1179 == var4) {
						field1493 = var7;
					}

					if (field1493 != null) {
						var7.field1180 = 0;
					}
				}

				if (field1493 != null) {
					field1479 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1493.field1181 = null;

						if (field1493.field1182) {
							synchronized (field1482) {
								field1482.method3(field1493);
							}
						} else {
							field1493.method604();
						}

						field1493 = null;
					} else {
						if (field1493.field1181 == null && var6 == 0) {
							field1493.field1181 = new byte[var5];
						}

						if (field1493.field1181 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1486 = var6 * 500;
				field1487 = 500;
				if (field1487 > var5 - var6 * 500) {
					field1487 = var5 - var6 * 500;
				}
			}

			if (field1487 > 0 && var1 >= field1487) {
				field1466 = true;
				byte[] var9 = field1488;
				int var10 = 0;
				if (field1493 != null) {
					var9 = field1493.field1181;
					var10 = field1486;
				}

				for (int var11 = 0; var11 < field1487; var11 += field1492.read(var9, var10 + var11, field1487 - var11)) {
				}

				if (field1487 + field1486 >= var9.length && field1493 != null) {
					if (field1494.field463[0] != null) {
						field1494.field463[field1493.field1178 + 1].method326(var9.length, var9, field1493.field1179);
					}

					if (!field1493.field1182 && field1493.field1178 == 3) {
						field1493.field1182 = true;
						field1493.field1178 = 93;
					}

					if (field1493.field1182) {
						synchronized (field1482) {
							field1482.method3(field1493);
						}
					} else {
						field1493.method604();
					}
				}

				field1487 = 0;
			}
		} catch (IOException var17) {
			try {
				field1481.close();
			} catch (Exception var14) {
			}

			field1481 = null;
			field1492 = null;
			field1476 = null;
			field1487 = 0;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(II)I")
	public final int method582(int arg0) {
		return field1463[arg0] & 0xFF;
	}

	@ObfuscatedName("ZPGPWCCV.a(I)V")
	public final void method456(int arg0) {
		method586(0, arg0);
	}

	@ObfuscatedName("ZPGPWCCV.b(I)V")
	public final void method583() {
		while (field1470 == 0) {
			if (field1471 >= 10 || field1469 == 0) {
				return;
			}

			OnDemandRequest var2;
			synchronized (field1483) {
				var2 = (OnDemandRequest) field1483.method5();
			}

			while (var2 != null) {
				if (field1465[var2.field1178][var2.field1179] != 0) {
					field1465[var2.field1178][var2.field1179] = 0;
					field1495.method3(var2);
					method599(var2);
					field1466 = true;

					if (field1462 < field1477) {
						field1462++;
					}

					field1474 = "Loading extra files - " + field1462 * 100 / field1477 + "%";
					field1471++;
					if (field1471 == 10) {
						return;
					}
				}

				synchronized (field1483) {
					var2 = (OnDemandRequest) field1483.method5();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1465[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1469) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.field1178 = var4;
						var8.field1179 = var7;
						var8.field1182 = false;
						field1495.method3(var8);
						method599(var8);
						field1466 = true;

						if (field1462 < field1477) {
							field1462++;
						}

						field1474 = "Loading extra files - " + field1462 * 100 / field1477 + "%";
						field1471++;
						if (field1471 == 10) {
							return;
						}
					}
				}
			}

			field1469--;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IIBI)V")
	public final void method584(int arg0, byte arg1, int arg2) {
		if (field1494.field463[0] != null && field1498[arg0][arg2] != 0) {
			byte[] var4 = field1494.field463[arg0 + 1].method325(arg2);
			if (!method598(var4, field1498[arg0][arg2], field1472[arg0][arg2])) {
				field1465[arg0][arg2] = arg1;

				if (arg1 > field1469) {
					field1469 = arg1;
				}

				field1477++;
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IZ)Z")
	public final boolean method585(int arg0) {
		if (field1490[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZPGPWCCV.b(II)V")
	public final void method586(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1498.length && arg1 >= 0 && arg1 <= field1498[arg0].length && field1498[arg0][arg1] != 0) {
			synchronized (field1491) {
				for (OnDemandRequest var4 = (OnDemandRequest) field1491.method182(); var4 != null; var4 = (OnDemandRequest) field1491.method183()) {
					if (var4.field1178 == arg0 && var4.field1179 == arg1) {
						return;
					}
				}

				OnDemandRequest var5 = new OnDemandRequest();
				var5.field1178 = arg0;
				var5.field1179 = arg1;
				var5.field1182 = true;

				synchronized (field1468) {
					field1468.method3(var5);
				}

				field1491.method180(var5);
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.a()LQSLIGKQQ;")
	public final OnDemandRequest method587() {
		OnDemandRequest var2;
		synchronized (field1482) {
			var2 = (OnDemandRequest) field1482.method5();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1491) {
			var2.method185();
		}

		if (var2.field1181 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1181));
			while (true) {
				if (field1484.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1484, var4, field1484.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1181 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1181[var7] = field1484[var7];
		}

		return var2;
	}

	public final void run() {
		try {
			while (field1467) {
				field1475++;
				byte var1 = 20;
				if (field1469 == 0 && field1494.field463[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1466 = true;
				for (int var2 = 0; var2 < 100 && field1466; var2++) {
					field1466 = false;
					method595();
					method588();

					if (field1470 == 0 && var2 >= 5) {
						break;
					}

					method583();

					if (field1492 != null) {
						method581();
					}
				}

				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) field1495.method6(); var4 != null; var4 = (OnDemandRequest) field1495.method8()) {
					if (var4.field1182) {
						var3 = true;
						var4.field1180++;
						if (var4.field1180 > 50) {
							var4.field1180 = 0;
							method599(var4);
						}
					}
				}

				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) field1495.method6(); var5 != null; var5 = (OnDemandRequest) field1495.method8()) {
						var3 = true;
						var5.field1180++;
						if (var5.field1180 > 50) {
							var5.field1180 = 0;
							method599(var5);
						}
					}
				}

				if (var3) {
					field1479++;
					if (field1479 > 750) {
						try {
							field1481.close();
						} catch (Exception var8) {
						}

						field1481 = null;
						field1492 = null;
						field1476 = null;
						field1487 = 0;
					}
				} else {
					field1479 = 0;
					field1474 = "";
				}

				if (field1494.field383 && field1481 != null && field1476 != null && (field1469 > 0 || field1494.field463[0] == null)) {
					field1496++;
					if (field1496 > 500) {
						field1496 = 0;
						field1488[0] = 0;
						field1488[1] = 0;
						field1488[2] = 0;
						field1488[3] = 10;
						try {
							field1476.write(field1488, 0, 4);
						} catch (IOException var7) {
							field1479 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ZPGPWCCV.c(I)V")
	public final void method588() {
		field1470 = 0;
		field1471 = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) field1495.method6(); var1 != null; var1 = (OnDemandRequest) field1495.method8()) {
			if (var1.field1182) {
				field1470++;
			} else {
				field1471++;
			}
		}

		while (field1470 < 10) {
			OnDemandRequest var2 = (OnDemandRequest) field1478.method5();
			if (var2 == null) {
				break;
			}

			if (field1465[var2.field1178][var2.field1179] != 0) {
				field1462++;
			}

			field1465[var2.field1178][var2.field1179] = 0;
			field1495.method3(var2);
			field1470++;
			method599(var2);
			field1466 = true;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(ZB)V")
	public final void method589(boolean arg0) {
		int var2 = field1473.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1464[var3] != 0) {
				method584(3, (byte) 2, field1489[var3]);
				method584(3, (byte) 2, field1485[var3]);
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.b()I")
	public final int method590() {
		synchronized (field1491) {
			return field1491.method184();
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(IZ)Z")
	public final boolean method591(int arg0) {
		for (int var2 = 0; var2 < field1473.length; var2++) {
			if (field1489[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZPGPWCCV.a(LATJMVOZR;Lclient;)V")
	public final void method592(Jagfile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method2(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5);
			field1498[var4] = new int[var6];
			field1465[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1498[var4][var8] = var7.g2();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method2(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11);
			field1472[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1472[var10][var14] = var13.g4();
			}
		}

		byte[] var15 = arg0.method2("model_index", null);
		int var16 = field1498[0].length;
		field1463 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1463[var17] = var15[var17];
			} else {
				field1463[var17] = 0;
			}
		}

		byte[] var18 = arg0.method2("map_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length / 7;
		field1473 = new int[var20];
		field1485 = new int[var20];
		field1489 = new int[var20];
		field1464 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1473[var21] = var19.g2();
			field1485[var21] = var19.g2();
			field1489[var21] = var19.g2();
			field1464[var21] = var19.g1();
		}

		byte[] var22 = arg0.method2("anim_index", null);
		Packet var23 = new Packet(var22);
		int var24 = var22.length / 2;
		field1497 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1497[var25] = var23.g2();
		}

		byte[] var26 = arg0.method2("midi_index", null);
		Packet var27 = new Packet(var26);
		int var28 = var26.length;
		field1490 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1490[var29] = var27.g1();
		}

		field1494 = arg1;
		field1467 = true;
		field1494.method142(this, 2);
	}

	@ObfuscatedName("ZPGPWCCV.a(B)V")
	public final void method593() {
		synchronized (field1483) {
			field1483.method10();
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IIB)V")
	public final void method594(int arg0, int arg1) {
		if (field1494.field463[0] != null && (field1498[arg1][arg0] != 0 && (field1465[arg1][arg0] != 0 && field1469 != 0))) {
			OnDemandRequest var3 = new OnDemandRequest();
			var3.field1178 = arg1;
			var3.field1179 = arg0;
			var3.field1182 = false;

			synchronized (field1483) {
				field1483.method3(var3);
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(Z)V")
	public final void method595() {
		OnDemandRequest var2;
		synchronized (field1468) {
			var2 = (OnDemandRequest) field1468.method5();
		}

		while (var2 != null) {
			field1466 = true;
			byte[] var3 = null;
			if (field1494.field463[0] != null) {
				var3 = field1494.field463[var2.field1178 + 1].method325(var2.field1179);
			}

			if (!method598(var3, field1498[var2.field1178][var2.field1179], field1472[var2.field1178][var2.field1179])) {
				var3 = null;
			}

			synchronized (field1468) {
				if (var3 == null) {
					field1478.method3(var2);
				} else {
					var2.field1181 = var3;

					synchronized (field1482) {
						field1482.method3(var2);
					}
				}

				var2 = (OnDemandRequest) field1468.method5();
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.c()V")
	public final void method596() {
		field1467 = false;
	}

	@ObfuscatedName("ZPGPWCCV.c(II)I")
	public final int method597(int arg0) {
		return field1498[arg0].length;
	}

	@ObfuscatedName("ZPGPWCCV.a([BIII)Z")
	public final boolean method598(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1480.reset();
			field1480.update(arg0, 0, var4);
			int var6 = (int) field1480.getValue();

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

	@ObfuscatedName("ZPGPWCCV.a(ILQSLIGKQQ;)V")
	public final void method599(OnDemandRequest arg0) {
		try {
			if (field1481 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1499 < 4000L) {
					return;
				}

				field1499 = var2;
				field1481 = field1494.method52(Client.field197 + 43594);
				field1492 = field1481.getInputStream();
				field1476 = field1481.getOutputStream();
				field1476.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1492.read();
				}

				field1479 = 0;
			}

			field1488[0] = (byte) arg0.field1178;
			field1488[1] = (byte) (arg0.field1179 >> 8);
			field1488[2] = (byte) arg0.field1179;
			if (arg0.field1182) {
				field1488[3] = 2;
			} else if (field1494.field383) {
				field1488[3] = 0;
			} else {
				field1488[3] = 1;
			}

			field1476.write(field1488, 0, 4);
			field1496 = 0;
			field1500 = -10000;
		} catch (IOException var7) {
			try {
				field1481.close();
			} catch (Exception var6) {
			}

			field1481 = null;
			field1492 = null;
			field1476 = null;
			field1487 = 0;
			field1500++;
		}
	}

	@ObfuscatedName("ZPGPWCCV.d(I)I")
	public final int method600() {
		return field1497.length;
	}

	@ObfuscatedName("ZPGPWCCV.a(IIII)I")
	public final int method601(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field1473.length; var5++) {
			if (field1473[var5] == var4) {
				if (arg2 == 0) {
					return field1485[var5];
				}

				return field1489[var5];
			}
		}

		return -1;
	}
}
