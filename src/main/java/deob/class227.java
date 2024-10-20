package deob;

import java.util.Arrays;

@ObfuscatedName("iz")
public class class227 implements class30 {

    @ObfuscatedName("iz.am")
    public char[] field2397 = new char[128];

    @ObfuscatedName("iz.ap")
    public int[] field2406 = new int[128];

    @ObfuscatedName("iz.af")
    public int[] field2396 = new int[128];

    @ObfuscatedName("iz.aj")
    public int field2399 = 0;

    @ObfuscatedName("iz.aq")
    public int[] field2398 = new int[128];

    @ObfuscatedName("iz.ar")
    public int field2407 = 0;

    @ObfuscatedName("iz.ag")
    public int field2400 = 0;

    @ObfuscatedName("iz.ao")
    public int field2401 = 0;

    @ObfuscatedName("iz.ae")
    public int field2402 = 0;

    @ObfuscatedName("iz.aa")
    public boolean[] field2395 = new boolean[112];

    @ObfuscatedName("iz.au")
    public boolean[] field2404 = new boolean[112];

    @ObfuscatedName("iz.an")
    public boolean[] field2405 = new boolean[112];

    @ObfuscatedName("iz.ad")
    public char field2403;

    @ObfuscatedName("iz.ax")
    public int field2394;

    @ObfuscatedName("iz.am(II)Z")
    public boolean method441(int arg0) {
        this.method4049(arg0);
        this.field2395[arg0] = true;
        this.field2404[arg0] = true;
        this.field2405[arg0] = false;
        this.field2396[++this.field2399 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iz.ap(II)Z")
    public boolean method438(int arg0) {
        this.field2395[arg0] = false;
        this.field2404[arg0] = false;
        this.field2405[arg0] = true;
        this.field2398[++this.field2407 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iz.af(CB)Z")
    public boolean method437(char arg0) {
        int var2 = this.field2401 + 1 & 0x7F;
        if (this.field2400 != var2) {
            this.field2406[this.field2401] = -1;
            this.field2397[this.field2401] = arg0;
            this.field2401 = var2;
        }
        return false;
    }

    @ObfuscatedName("iz.ax(IS)V")
    public void method4049(int arg0) {
        int var2 = this.field2401 + 1 & 0x7F;
        if (this.field2400 != var2) {
            this.field2406[this.field2401] = arg0;
            this.field2397[this.field2401] = 0;
            this.field2401 = var2;
        }
    }

    @ObfuscatedName("iz.aj(ZI)Z")
    public boolean method444(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iz.aw(I)V")
    public void method4050() {
        this.field2400 = this.field2402;
        this.field2402 = this.field2401;
        this.field2399 = 0;
        this.field2407 = 0;
        Arrays.fill(this.field2404, false);
        Arrays.fill(this.field2405, false);
    }

    @ObfuscatedName("iz.az(I)Z")
    public final boolean method4051() {
        if (this.field2402 == this.field2400) {
            return false;
        } else {
            this.field2394 = this.field2406[this.field2400];
            this.field2403 = this.field2397[this.field2400];
            this.field2400 = this.field2400 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("iz.av(II)Z")
    public boolean method4052(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2404[arg0] : false;
    }

    @ObfuscatedName("iz.ak(II)Z")
    public boolean method4053(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2395[arg0] : false;
    }

    @ObfuscatedName("iz.ay(II)Z")
    public boolean method4054(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2405[arg0] : false;
    }

    @ObfuscatedName("iz.as(B)[I")
    public int[] method4055() {
        int[] var1 = new int[this.field2399];
        for (int var2 = 0; var2 < this.field2399; var2++) {
            var1[var2] = this.field2396[var2];
        }
        return var1;
    }

    @ObfuscatedName("iz.ab(I)[I")
    public int[] method4056() {
        int[] var1 = new int[this.field2407];
        for (int var2 = 0; var2 < this.field2407; var2++) {
            var1[var2] = this.field2398[var2];
        }
        return var1;
    }
}
