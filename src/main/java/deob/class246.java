package deob;

import java.util.LinkedList;

@ObfuscatedName("jm")
public abstract class class246 {

    @ObfuscatedName("jm.ab")
    public int field2575;

    @ObfuscatedName("jm.au")
    public int field2562;

    @ObfuscatedName("jm.aa")
    public int field2563;

    @ObfuscatedName("jm.ac")
    public int field2564;

    @ObfuscatedName("jm.al")
    public int field2565;

    @ObfuscatedName("jm.az")
    public int field2573;

    @ObfuscatedName("jm.ap")
    public int field2567 = -1;

    @ObfuscatedName("jm.av")
    public int field2568 = -1;

    @ObfuscatedName("jm.ax")
    public short[][][] field2569;

    @ObfuscatedName("jm.as")
    public short[][][] field2570;

    @ObfuscatedName("jm.ay")
    public byte[][][] field2561;

    @ObfuscatedName("jm.ak")
    public byte[][][] field2572;

    @ObfuscatedName("jm.aj")
    public class248[][][][] field2571;

    @ObfuscatedName("jm.am")
    public boolean field2574;

    @ObfuscatedName("jm.aq")
    public boolean field2566;

    public class246() {
        new LinkedList();
        this.field2574 = false;
        this.field2566 = false;
    }

    @ObfuscatedName("jm.ae(I)Z")
    public boolean method4438() {
        return this.field2574 && this.field2566;
    }

    @ObfuscatedName("jm.an(Lol;I)V")
    public void method4440(class371 arg0) {
        if (this.method4438()) {
            return;
        }
        byte[] var2 = arg0.method6284(this.field2567, this.field2568);
        if (var2 != null) {
            this.method4104(new class527(var2));
            this.field2574 = true;
            this.field2566 = true;
        }
    }

    @ObfuscatedName("jm.ag(I)V")
    public void method4441() {
        this.field2569 = (short[][][]) null;
        this.field2570 = (short[][][]) null;
        this.field2561 = (byte[][][]) null;
        this.field2572 = (byte[][][]) null;
        this.field2571 = (class248[][][][]) null;
        this.field2574 = false;
        this.field2566 = false;
    }

    @ObfuscatedName("jm.ad(IILuj;I)V")
    public void method4450(int arg0, int arg1, class527 arg2) {
        int var4 = arg2.method8410();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4443(arg0, arg1, arg2, var4);
        } else {
            this.method4442(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("jm.af(IILuj;II)V")
    public void method4442(int arg0, int arg1, class527 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2570[0][arg0][arg1] = (short) arg2.method8412();
        }
        this.field2569[0][arg0][arg1] = (short) arg2.method8412();
    }

    @ObfuscatedName("jm.be(IILuj;II)V")
    public void method4443(int arg0, int arg1, class527 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2569[0][arg0][arg1] = (short) arg2.method8412();
        if (var6) {
            int var8 = arg2.method8410();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8412();
                if (var10 != 0) {
                    this.field2570[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8410();
                    this.field2561[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2572[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8410();
            if (var13 != 0) {
                class248[] var14 = this.field2571[var12][arg0][arg1] = new class248[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8430();
                    int var17 = arg2.method8410();
                    var14[var15] = new class248(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("jm.bd(I)I")
    public int method4445() {
        return this.field2563;
    }

    @ObfuscatedName("jm.bl(B)I")
    public int method4446() {
        return this.field2564;
    }

    @ObfuscatedName("jm.ah(Luj;B)V")
    public abstract void method4104(class527 arg0);
}
