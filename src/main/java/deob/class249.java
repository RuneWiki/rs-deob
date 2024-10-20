package deob;

import java.util.LinkedList;

@ObfuscatedName("jw")
public abstract class class249 {

    @ObfuscatedName("jw.aq")
    public int field2617;

    @ObfuscatedName("jw.ar")
    public int field2614;

    @ObfuscatedName("jw.ag")
    public int field2608;

    @ObfuscatedName("jw.ao")
    public int field2609;

    @ObfuscatedName("jw.ae")
    public int field2610;

    @ObfuscatedName("jw.aa")
    public int field2611;

    @ObfuscatedName("jw.au")
    public int field2612 = -1;

    @ObfuscatedName("jw.an")
    public int field2613 = -1;

    @ObfuscatedName("jw.ad")
    public short[][][] field2615;

    @ObfuscatedName("jw.ax")
    public short[][][] field2606;

    @ObfuscatedName("jw.aw")
    public byte[][][] field2616;

    @ObfuscatedName("jw.az")
    public byte[][][] field2618;

    @ObfuscatedName("jw.av")
    public class251[][][][] field2620;

    @ObfuscatedName("jw.ak")
    public boolean field2619;

    @ObfuscatedName("jw.ay")
    public boolean field2607;

    public class249() {
        new LinkedList();
        this.field2619 = false;
        this.field2607 = false;
    }

    @ObfuscatedName("jw.ak(B)Z")
    public boolean method4541() {
        return this.field2619 && this.field2607;
    }

    @ObfuscatedName("jw.ay(Low;I)V")
    public void method4551(class375 arg0) {
        if (this.method4541()) {
            return;
        }
        byte[] var2 = arg0.method6396(this.field2612, this.field2613);
        if (var2 != null) {
            this.method4209(new class531(var2));
            this.field2619 = true;
            this.field2607 = true;
        }
    }

    @ObfuscatedName("jw.as(B)V")
    public void method4544() {
        this.field2615 = (short[][][]) null;
        this.field2606 = (short[][][]) null;
        this.field2616 = (byte[][][]) null;
        this.field2618 = (byte[][][]) null;
        this.field2620 = (class251[][][][]) null;
        this.field2619 = false;
        this.field2607 = false;
    }

    @ObfuscatedName("jw.ab(IILuk;I)V")
    public void method4545(int arg0, int arg1, class531 arg2) {
        int var4 = arg2.method8561();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4546(arg0, arg1, arg2, var4);
        } else {
            this.method4563(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("jw.ah(IILuk;II)V")
    public void method4563(int arg0, int arg1, class531 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2606[0][arg0][arg1] = (short) arg2.method8775();
        }
        this.field2615[0][arg0][arg1] = (short) arg2.method8775();
    }

    @ObfuscatedName("jw.ai(IILuk;II)V")
    public void method4546(int arg0, int arg1, class531 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2615[0][arg0][arg1] = (short) arg2.method8775();
        if (var6) {
            int var8 = arg2.method8561();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8775();
                if (var10 != 0) {
                    this.field2606[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8561();
                    this.field2616[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2618[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8561();
            if (var13 != 0) {
                class251[] var14 = this.field2620[var12][arg0][arg1] = new class251[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8721();
                    int var17 = arg2.method8561();
                    var14[var15] = new class251(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("jw.ac(I)I")
    public int method4567() {
        return this.field2608;
    }

    @ObfuscatedName("jw.al(S)I")
    public int method4547() {
        return this.field2609;
    }

    @ObfuscatedName("jw.ap(Luk;I)V")
    public abstract void method4209(class531 arg0);
}
