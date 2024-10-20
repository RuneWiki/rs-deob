package deob;

import java.util.Arrays;

@ObfuscatedName("ih")
public class class214 implements class30 {

    @ObfuscatedName("ih.aw")
    public char[] field2318 = new char[128];

    @ObfuscatedName("ih.ay")
    public int[] field2326 = new int[128];

    @ObfuscatedName("ih.ar")
    public int[] field2320 = new int[128];

    @ObfuscatedName("ih.am")
    public int field2332 = 0;

    @ObfuscatedName("ih.as")
    public int[] field2325 = new int[128];

    @ObfuscatedName("ih.aj")
    public int field2323 = 0;

    @ObfuscatedName("ih.ag")
    public int field2324 = 0;

    @ObfuscatedName("ih.az")
    public int field2319 = 0;

    @ObfuscatedName("ih.av")
    public int field2322 = 0;

    @ObfuscatedName("ih.ap")
    public boolean[] field2327 = new boolean[112];

    @ObfuscatedName("ih.aq")
    public boolean[] field2328 = new boolean[112];

    @ObfuscatedName("ih.at")
    public boolean[] field2329 = new boolean[112];

    @ObfuscatedName("ih.ah")
    public char field2330;

    @ObfuscatedName("ih.ax")
    public int field2331;

    @ObfuscatedName("ih.aw(II)Z")
    public boolean method436(int arg0) {
        this.method3794(arg0);
        this.field2327[arg0] = true;
        this.field2328[arg0] = true;
        this.field2329[arg0] = false;
        this.field2320[++this.field2332 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ih.ay(II)Z")
    public boolean method427(int arg0) {
        this.field2327[arg0] = false;
        this.field2328[arg0] = false;
        this.field2329[arg0] = true;
        this.field2325[++this.field2323 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ih.ar(CI)Z")
    public boolean method428(char arg0) {
        int var2 = this.field2319 + 1 & 0x7F;
        if (this.field2324 != var2) {
            this.field2326[this.field2319] = -1;
            this.field2318[this.field2319] = arg0;
            this.field2319 = var2;
        }
        return false;
    }

    @ObfuscatedName("ih.ax(II)V")
    public void method3794(int arg0) {
        int var2 = this.field2319 + 1 & 0x7F;
        if (this.field2324 != var2) {
            this.field2326[this.field2319] = arg0;
            this.field2318[this.field2319] = 0;
            this.field2319 = var2;
        }
    }

    @ObfuscatedName("ih.am(ZB)Z")
    public boolean method429(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ih.aa(I)V")
    public void method3811() {
        this.field2324 = this.field2322;
        this.field2322 = this.field2319;
        this.field2332 = 0;
        this.field2323 = 0;
        Arrays.fill(this.field2328, false);
        Arrays.fill(this.field2329, false);
    }

    @ObfuscatedName("ih.au(I)Z")
    public final boolean method3802() {
        if (this.field2324 == this.field2322) {
            return false;
        } else {
            this.field2331 = this.field2326[this.field2324];
            this.field2330 = this.field2318[this.field2324];
            this.field2324 = this.field2324 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("ih.ae(II)Z")
    public boolean method3795(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2328[arg0] : false;
    }

    @ObfuscatedName("ih.ab(II)Z")
    public boolean method3796(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2327[arg0] : false;
    }

    @ObfuscatedName("ih.ad(II)Z")
    public boolean method3797(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2329[arg0] : false;
    }

    @ObfuscatedName("ih.ao(I)[I")
    public int[] method3817() {
        int[] var1 = new int[this.field2332];
        for (int var2 = 0; var2 < this.field2332; var2++) {
            var1[var2] = this.field2320[var2];
        }
        return var1;
    }

    @ObfuscatedName("ih.ac(B)[I")
    public int[] method3799() {
        int[] var1 = new int[this.field2323];
        for (int var2 = 0; var2 < this.field2323; var2++) {
            var1[var2] = this.field2325[var2];
        }
        return var1;
    }
}
