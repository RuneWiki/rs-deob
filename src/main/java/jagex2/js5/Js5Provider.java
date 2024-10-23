package jagex2.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex2.datastruct.ByteArrayCopier;
import jagex2.datastruct.LinkList;
import jagex2.io.FileStream;
import jagex2.io.Packet;
import java.util.zip.CRC32;

@ObfuscatedName("dq")
public class Js5Provider extends Js5Index {

    @ObfuscatedName("dq.f")
    public FileStream field1578;

    @ObfuscatedName("dq.k")
    public FileStream field1573;

    @ObfuscatedName("dq.o")
    public int field1574;

    @ObfuscatedName("dq.a")
    public volatile boolean field1575 = false;

    @ObfuscatedName("dq.h")
    public boolean field1576 = false;

    @ObfuscatedName("dq.x")
    public volatile boolean[] field1572;

    @ObfuscatedName("dq.p")
    public static CRC32 field1579 = new CRC32();

    @ObfuscatedName("dq.ad")
    public int field1580;

    @ObfuscatedName("dq.ac")
    public int field1577;

    @ObfuscatedName("dq.aa")
    public int field1581 = -1;

    public Js5Provider(FileStream arg0, FileStream arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1578 = arg0;
        this.field1573 = arg1;
        this.field1574 = arg2;
        this.field1576 = arg5;
        int var8 = this.field1574;
        if (Statics.field542 == null) {
            Statics.method827((Js5Provider) null, 255, 255, 0, (byte) 0, true);
            Js5TcpClient.field1200[var8] = this;
        } else {
            Statics.field542.field1729 = var8 * 8 + 5;
            int var9 = Statics.field542.method1605();
            int var10 = Statics.field542.method1605();
            this.method1476(var9, var10);
        }
    }

    @ObfuscatedName("dq.bo(B)I")
    public int method1483() {
        if (this.field1575) {
            return 100;
        } else if (this.field1178 == null) {
            int var1 = Js5TcpClient.method161(255, this.field1574);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("dq.d(IB)V")
    public void method1043(int arg0) {
        Js5TcpClient.method555(this.field1574, arg0);
    }

    @ObfuscatedName("dq.i(IB)V")
    public void method1052(int arg0) {
        if (this.field1578 == null || this.field1572 == null || !this.field1572[arg0]) {
            Statics.method827(this, this.field1574, arg0, this.field1169[arg0], (byte) 2, true);
        } else {
            Statics.method1122(arg0, this.field1578, this);
        }
    }

    @ObfuscatedName("dq.bq(III)V")
    public void method1476(int arg0, int arg1) {
        this.field1580 = arg0;
        this.field1577 = arg1;
        if (this.field1573 == null) {
            Statics.method827(this, 255, this.field1574, this.field1580, (byte) 0, true);
        } else {
            Statics.method1122(this.field1574, this.field1573, this);
        }
    }

    @ObfuscatedName("dq.bj(I[BZZB)V")
    public void method1467(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field1179[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field1179[arg0];
            if (this.field1578 != null) {
                FileStream var12 = this.field1578;
                Js5NetProviderRequest var13 = new Js5NetProviderRequest();
                var13.field1772 = 0;
                var13.field1506 = (long) arg0;
                var13.field1771 = arg1;
                var13.field1770 = var12;
                LinkList var14 = Js5NetProvider.field1208;
                synchronized (Js5NetProvider.field1208) {
                    Js5NetProvider.field1208.method1292(var13);
                }
                Object var16 = Js5NetProvider.field1207;
                synchronized (Js5NetProvider.field1207) {
                    if (Js5NetProvider.field1205 == 0) {
                        Statics.field1542.method437(new Js5NetProvider(), 5);
                    }
                    Js5NetProvider.field1205 = 600;
                }
                this.field1572[arg0] = true;
            }
            if (arg3) {
                this.field1178[arg0] = ByteArrayCopier.method1131(arg1, false);
            }
            return;
        }
        if (this.field1575) {
            throw new RuntimeException();
        }
        if (this.field1573 != null) {
            int var5 = this.field1574;
            FileStream var6 = this.field1573;
            Js5NetProviderRequest var7 = new Js5NetProviderRequest();
            var7.field1772 = 0;
            var7.field1506 = (long) var5;
            var7.field1771 = arg1;
            var7.field1770 = var6;
            LinkList var8 = Js5NetProvider.field1208;
            synchronized (Js5NetProvider.field1208) {
                Js5NetProvider.field1208.method1292(var7);
            }
            Object var10 = Js5NetProvider.field1207;
            synchronized (Js5NetProvider.field1207) {
                if (Js5NetProvider.field1205 == 0) {
                    Statics.field1542.method437(new Js5NetProvider(), 5);
                }
                Js5NetProvider.field1205 = 600;
            }
        }
        this.method1042(arg1);
        this.method1469();
    }

    @ObfuscatedName("dq.bz(Lap;I[BZI)V")
    public void method1468(FileStream arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field1573 != arg0) {
            if (!arg3 && this.field1581 == arg1) {
                this.field1575 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field1572[arg1] = false;
                if (this.field1576 || arg3) {
                    Statics.method827(this, this.field1574, arg1, this.field1169[arg1], (byte) 2, arg3);
                }
                return;
            }
            field1579.reset();
            field1579.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field1579.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field1169[arg1] != var9 || this.field1179[arg1] != var10) {
                this.field1572[arg1] = false;
                if (this.field1576 || arg3) {
                    Statics.method827(this, this.field1574, arg1, this.field1169[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field1572[arg1] = true;
            if (arg3) {
                this.field1178[arg1] = ByteArrayCopier.method1131(arg2, false);
            }
            return;
        }
        if (this.field1575) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method827(this, 255, this.field1574, this.field1580, (byte) 0, true);
            return;
        }
        field1579.reset();
        field1579.update(arg2, 0, arg2.length);
        int var5 = (int) field1579.getValue();
        Packet var6 = new Packet(Js5Index.method52(arg2));
        int var7 = var6.method1600();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method1605();
        }
        if (this.field1580 != var5 || this.field1577 != var8) {
            Statics.method827(this, 255, this.field1574, this.field1580, (byte) 0, true);
            return;
        }
        this.method1042(arg2);
        this.method1469();
    }

    @ObfuscatedName("dq.bm(S)V")
    public void method1469() {
        this.field1572 = new boolean[this.field1178.length];
        for (int var1 = 0; var1 < this.field1572.length; var1++) {
            this.field1572[var1] = false;
        }
        if (this.field1578 == null) {
            this.field1575 = true;
            return;
        }
        this.field1581 = -1;
        for (int var2 = 0; var2 < this.field1572.length; var2++) {
            if (this.field1171[var2] > 0) {
                FileStream var3 = this.field1578;
                Js5NetProviderRequest var5 = new Js5NetProviderRequest();
                var5.field1772 = 1;
                var5.field1506 = (long) var2;
                var5.field1770 = var3;
                var5.field1773 = this;
                LinkList var6 = Js5NetProvider.field1208;
                synchronized (Js5NetProvider.field1208) {
                    Js5NetProvider.field1208.method1292(var5);
                }
                Object var8 = Js5NetProvider.field1207;
                synchronized (Js5NetProvider.field1207) {
                    if (Js5NetProvider.field1205 == 0) {
                        Statics.field1542.method437(new Js5NetProvider(), 5);
                    }
                    Js5NetProvider.field1205 = 600;
                }
                this.field1581 = var2;
            }
        }
        if (this.field1581 == -1) {
            this.field1575 = true;
        }
    }

    @ObfuscatedName("dq.bn(II)I")
    public int method1472(int arg0) {
        if (this.field1178[arg0] == null) {
            return this.field1572[arg0] ? 100 : Js5TcpClient.method161(this.field1574, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("dq.be(I)I")
    public int method1470() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1178.length; var3++) {
            if (this.field1171[var3] > 0) {
                var1 += 100;
                var2 += this.method1472(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
