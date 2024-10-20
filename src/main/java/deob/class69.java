package deob;

@ObfuscatedName("cq")
public final class class69 extends class225 {

    @ObfuscatedName("cq.aj")
    public int field849;

    @ObfuscatedName("cq.al")
    public int field856;

    @ObfuscatedName("cq.ac")
    public int field848;

    @ObfuscatedName("cq.ab")
    public int field857;

    @ObfuscatedName("cq.an")
    public int field850;

    @ObfuscatedName("cq.ao")
    public int field851;

    @ObfuscatedName("cq.av")
    public class206 field852;

    @ObfuscatedName("cq.aq")
    public int field847 = 0;

    @ObfuscatedName("cq.ap")
    public int field854 = 0;

    @ObfuscatedName("cq.ar")
    public boolean field855 = false;

    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field849 = arg0;
        this.field848 = arg1;
        this.field857 = arg2;
        this.field850 = arg3;
        this.field851 = arg4;
        this.field856 = arg5 + arg6;
        int var8 = class195.method298(this.field849).field2057;
        if (var8 == -1) {
            this.field855 = true;
        } else {
            this.field855 = false;
            this.field852 = class206.method5217(var8);
        }
    }

    @ObfuscatedName("cq.aj(II)V")
    public final void method1935(int arg0) {
        if (this.field855) {
            return;
        }
        this.field854 += arg0;
        if (this.field852.method3694()) {
            this.field847 += arg0;
            if (this.field847 >= this.field852.method3695()) {
                this.field855 = true;
            }
            return;
        }
        while (this.field854 > this.field852.field2264[this.field847]) {
            this.field854 -= this.field852.field2264[this.field847];
            this.field847++;
            if (this.field847 >= this.field852.field2276.length) {
                this.field855 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cq.al(I)Lix;")
    public final class231 method1936() {
        class195 var1 = class195.method298(this.field849);
        class231 var2;
        if (this.field855) {
            var2 = var1.method3405(-1);
        } else {
            var2 = var1.method3405(this.field847);
        }
        return var2 == null ? null : var2;
    }
}
