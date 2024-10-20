package deob;

import java.util.LinkedList;

@ObfuscatedName("jk")
public abstract class class257 {

    @ObfuscatedName("jk.ap")
    public int field2682;

    @ObfuscatedName("jk.an")
    public int field2674;

    @ObfuscatedName("jk.aj")
    public int field2670;

    @ObfuscatedName("jk.av")
    public int field2671;

    @ObfuscatedName("jk.ab")
    public int field2672;

    @ObfuscatedName("jk.ai")
    public int field2680;

    @ObfuscatedName("jk.ae")
    public int field2683 = -1;

    @ObfuscatedName("jk.au")
    public int field2675 = -1;

    @ObfuscatedName("jk.ah")
    public short[][][] field2673;

    @ObfuscatedName("jk.az")
    public short[][][] field2677;

    @ObfuscatedName("jk.ax")
    public byte[][][] field2678;

    @ObfuscatedName("jk.ac")
    public byte[][][] field2679;

    @ObfuscatedName("jk.al")
    public class259[][][][] field2668;

    @ObfuscatedName("jk.ay")
    public boolean field2681;

    @ObfuscatedName("jk.ao")
    public boolean field2669;

    public class257() {
        new LinkedList();
        this.field2681 = false;
        this.field2669 = false;
    }

    @ObfuscatedName("jk.aw(B)Z")
    public boolean method4552() {
        return this.field2681 && this.field2669;
    }

    @ObfuscatedName("jk.at(Lok;I)V")
    public void method4540(class388 arg0) {
        if (this.method4552()) {
            return;
        }
        byte[] var2 = arg0.method6539(this.field2683, this.field2675);
        if (var2 != null) {
            this.method4190(new class547(var2));
            this.field2681 = true;
            this.field2669 = true;
        }
    }

    @ObfuscatedName("jk.af(I)V")
    public void method4546() {
        this.field2673 = (short[][][]) null;
        this.field2677 = (short[][][]) null;
        this.field2678 = (byte[][][]) null;
        this.field2679 = (byte[][][]) null;
        this.field2668 = (class259[][][][]) null;
        this.field2681 = false;
        this.field2669 = false;
    }

    @ObfuscatedName("jk.am(IILvp;B)V")
    public void method4541(int arg0, int arg1, class547 arg2) {
        int var4 = arg2.method8804();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4543(arg0, arg1, arg2, var4);
        } else {
            this.method4542(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("jk.ar(IILvp;II)V")
    public void method4542(int arg0, int arg1, class547 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2677[0][arg0][arg1] = (short) arg2.method8899();
        }
        this.field2673[0][arg0][arg1] = (short) arg2.method8899();
    }

    @ObfuscatedName("jk.bt(IILvp;IB)V")
    public void method4543(int arg0, int arg1, class547 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2673[0][arg0][arg1] = (short) arg2.method8899();
        if (var6) {
            int var8 = arg2.method8804();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8899();
                if (var10 != 0) {
                    this.field2677[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8804();
                    this.field2678[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2679[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8804();
            if (var13 != 0) {
                class259[] var14 = this.field2668[var12][arg0][arg1] = new class259[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8773();
                    int var17 = arg2.method8804();
                    var14[var15] = new class259(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("jk.bj(B)I")
    public int method4563() {
        return this.field2670;
    }

    @ObfuscatedName("jk.be(I)I")
    public int method4545() {
        return this.field2671;
    }

    @ObfuscatedName("jk.ad(Lvp;B)V")
    public abstract void method4190(class547 arg0);
}
