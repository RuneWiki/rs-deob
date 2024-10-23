package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.graphics.SoftwareModel;

@ObfuscatedName("ff")
public class LocEntity extends Entity {

    @ObfuscatedName("ff.j")
    public int field2599;

    @ObfuscatedName("ff.z")
    public int field2592;

    @ObfuscatedName("ff.g")
    public int field2593;

    @ObfuscatedName("ff.q")
    public int field2594;

    @ObfuscatedName("ff.i")
    public int field2595;

    @ObfuscatedName("ff.s")
    public int field2596;

    @ObfuscatedName("ff.u")
    public SeqType field2597;

    @ObfuscatedName("ff.v")
    public int field2598;

    @ObfuscatedName("ff.w")
    public int field2591;

    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, Entity arg8) {
        this.field2599 = arg0;
        this.field2592 = arg1;
        this.field2593 = arg2;
        this.field2594 = arg3;
        this.field2595 = arg4;
        this.field2596 = arg5;
        if (arg6 != -1) {
            this.field2597 = SeqType.method104(arg6);
            this.field2598 = 0;
            this.field2591 = client.field1922 - 1;
            if (this.field2597.field2377 == 0 && arg8 != null && arg8 instanceof LocEntity) {
                LocEntity var10 = (LocEntity) arg8;
                if (this.field2597 == var10.field2597) {
                    this.field2598 = var10.field2598;
                    this.field2591 = var10.field2591;
                    return;
                }
            }
            if (arg7 && this.field2597.field2368 != -1) {
                this.field2598 = (int) (Math.random() * (double) this.field2597.field2364.length);
                this.field2591 -= (int) (Math.random() * (double) this.field2597.field2366[this.field2598]);
            }
        }
    }

    @ObfuscatedName("ff.g(I)Lfo;")
    public final SoftwareModel method2643() {
        if (this.field2597 != null) {
            int var1 = client.field1922 - this.field2591;
            if (var1 > 100 && this.field2597.field2368 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field2597.field2366[this.field2598]) {
                            break label47;
                        }
                        var1 -= this.field2597.field2366[this.field2598];
                        this.field2598++;
                    } while (this.field2598 < this.field2597.field2364.length);
                    this.field2598 -= this.field2597.field2368;
                } while (this.field2598 >= 0 && this.field2598 < this.field2597.field2364.length);
                this.field2597 = null;
            }
            this.field2591 = client.field1922 - var1;
        }
        LocType var2 = LocType.method2564(this.field2599);
        if (var2.field2317 != null) {
            var2 = var2.method2368();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field2593 == 1 || this.field2593 == 3) {
            var3 = var2.field2318;
            var4 = var2.field2344;
        } else {
            var3 = var2.field2344;
            var4 = var2.field2318;
        }
        int var5 = (var3 >> 1) + this.field2595;
        int var6 = (var3 + 1 >> 1) + this.field2595;
        int var7 = (var4 >> 1) + this.field2596;
        int var8 = (var4 + 1 >> 1) + this.field2596;
        int[][] var9 = World.field29[this.field2594];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field2595 << 7) + (var3 << 6);
        int var12 = (this.field2596 << 7) + (var4 << 6);
        return var2.method2376(this.field2592, this.field2593, var9, var11, var10, var12, this.field2597, this.field2598);
    }
}
