package deob;

import java.util.Arrays;

@ObfuscatedName("ia")
public class class229 implements class30 {

    @ObfuscatedName("ia.az")
    public char[] field2434 = new char[128];

    @ObfuscatedName("ia.ah")
    public int[] field2430 = new int[128];

    @ObfuscatedName("ia.af")
    public int[] field2433 = new int[128];

    @ObfuscatedName("ia.at")
    public int field2432 = 0;

    @ObfuscatedName("ia.an")
    public int[] field2442 = new int[128];

    @ObfuscatedName("ia.ao")
    public int field2431 = 0;

    @ObfuscatedName("ia.ab")
    public int field2435 = 0;

    @ObfuscatedName("ia.aw")
    public int field2436 = 0;

    @ObfuscatedName("ia.ad")
    public int field2437 = 0;

    @ObfuscatedName("ia.al")
    public boolean[] field2438 = new boolean[112];

    @ObfuscatedName("ia.as")
    public boolean[] field2439 = new boolean[112];

    @ObfuscatedName("ia.ag")
    public boolean[] field2440 = new boolean[112];

    @ObfuscatedName("ia.ai")
    public char field2429;

    @ObfuscatedName("ia.ax")
    public int field2441;

    @ObfuscatedName("ia.az(II)Z")
    public boolean method407(int arg0) {
        this.method3971(arg0);
        this.field2438[arg0] = true;
        this.field2439[arg0] = true;
        this.field2440[arg0] = false;
        this.field2433[++this.field2432 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ia.ah(IB)Z")
    public boolean method408(int arg0) {
        this.field2438[arg0] = false;
        this.field2439[arg0] = false;
        this.field2440[arg0] = true;
        this.field2442[++this.field2431 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ia.af(CI)Z")
    public boolean method409(char arg0) {
        int var2 = this.field2436 + 1 & 0x7F;
        if (this.field2435 != var2) {
            this.field2430[this.field2436] = -1;
            this.field2434[this.field2436] = arg0;
            this.field2436 = var2;
        }
        return false;
    }

    @ObfuscatedName("ia.ax(IB)V")
    public void method3971(int arg0) {
        int var2 = this.field2436 + 1 & 0x7F;
        if (this.field2435 != var2) {
            this.field2430[this.field2436] = arg0;
            this.field2434[this.field2436] = 0;
            this.field2436 = var2;
        }
    }

    @ObfuscatedName("ia.at(ZB)Z")
    public boolean method411(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ia.ar(I)V")
    public void method3978() {
        this.field2435 = this.field2437;
        this.field2437 = this.field2436;
        this.field2432 = 0;
        this.field2431 = 0;
        Arrays.fill(this.field2439, false);
        Arrays.fill(this.field2440, false);
    }

    @ObfuscatedName("ia.aj(I)Z")
    public final boolean method3986() {
        if (this.field2437 == this.field2435) {
            return false;
        } else {
            this.field2441 = this.field2430[this.field2435];
            this.field2429 = this.field2434[this.field2435];
            this.field2435 = this.field2435 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("ia.au(II)Z")
    public boolean method3982(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2439[arg0] : false;
    }

    @ObfuscatedName("ia.ay(IS)Z")
    public boolean method3974(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2438[arg0] : false;
    }

    @ObfuscatedName("ia.ap(IB)Z")
    public boolean method3975(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2440[arg0] : false;
    }

    @ObfuscatedName("ia.av(I)[I")
    public int[] method3976() {
        int[] var1 = new int[this.field2432];
        for (int var2 = 0; var2 < this.field2432; var2++) {
            var1[var2] = this.field2433[var2];
        }
        return var1;
    }

    @ObfuscatedName("ia.aa(I)[I")
    public int[] method3977() {
        int[] var1 = new int[this.field2431];
        for (int var2 = 0; var2 < this.field2431; var2++) {
            var1[var2] = this.field2442[var2];
        }
        return var1;
    }
}
