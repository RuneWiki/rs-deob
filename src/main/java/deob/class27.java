package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ag")
public class class27 {

    @ObfuscatedName("ag.a")
    public int field235 = -1;

    @ObfuscatedName("ag.s")
    public String field229;

    @ObfuscatedName("ag.g")
    public String field230;

    @ObfuscatedName("ag.x")
    public int field231 = -1;

    @ObfuscatedName("ag.h")
    public int field239 = -1;

    @ObfuscatedName("ag.f")
    public class235 field232 = null;

    @ObfuscatedName("ag.p")
    public int field238 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.m")
    public int field233 = 0;

    @ObfuscatedName("ag.q")
    public int field236 = Integer.MAX_VALUE;

    @ObfuscatedName("ag.b")
    public int field237 = 0;

    @ObfuscatedName("ag.n")
    public boolean field234 = false;

    @ObfuscatedName("ag.e")
    public LinkedList field228;

    @ObfuscatedName("ag.a(Lgx;IB)V")
    public void method348(class190 arg0, int arg1) {
        this.field235 = arg1;
        this.field229 = arg0.method3647();
        this.field230 = arg0.method3647();
        this.field232 = new class235(arg0.method3460());
        this.field231 = arg0.method3460();
        arg0.method3443();
        this.field234 = arg0.method3443() == 1;
        this.field239 = arg0.method3443();
        int var3 = arg0.method3443();
        this.field228 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field228.add(this.method295(arg0));
        }
        this.method300();
    }

    @ObfuscatedName("ag.s(Lgx;I)Lau;")
    public class38 method295(class190 arg0) {
        int var2 = arg0.method3443();
        class21[] var3 = new class21[] { class21.field159, class21.field158, class21.field162, class21.field160 };
        class21 var4 = (class21) Statics.method2007(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field161) {
            case 0:
                var6 = new class43();
                break;
            case 1:
                var6 = new class20();
                break;
            case 2:
                var6 = new class25();
                break;
            case 3:
                var6 = new class34();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method230(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("ag.g(IIII)Z")
    public boolean method313(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field228.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method227(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ag.x(IIS)Z")
    public boolean method355(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field238 || var3 > this.field233) {
            return false;
        } else if (var4 >= this.field236 && var4 <= this.field237) {
            Iterator var5 = this.field228.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method219(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.h(IIII)[I")
    public int[] method298(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field228.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method227(arg0, arg1, arg2));
        return var5.method241(arg0, arg1, arg2);
    }

    @ObfuscatedName("ag.f(III)Lif;")
    public class235 method347(int arg0, int arg1) {
        Iterator var3 = this.field228.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method219(arg0, arg1));
        return var4.method221(arg0, arg1);
    }

    @ObfuscatedName("ag.p(I)V")
    public void method300() {
        Iterator var1 = this.field228.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method242(this);
        }
    }

    @ObfuscatedName("ag.m(B)I")
    public int method332() {
        return this.field235;
    }

    @ObfuscatedName("ag.q(I)Z")
    public boolean method330() {
        return this.field234;
    }

    @ObfuscatedName("ag.b(B)Ljava/lang/String;")
    public String method303() {
        return this.field229;
    }

    @ObfuscatedName("ag.n(B)Ljava/lang/String;")
    public String method356() {
        return this.field230;
    }

    @ObfuscatedName("ag.e(B)I")
    public int method305() {
        return this.field231;
    }

    @ObfuscatedName("ag.r(I)I")
    public int method306() {
        return this.field239;
    }

    @ObfuscatedName("ag.t(I)I")
    public int method339() {
        return this.field238;
    }

    @ObfuscatedName("ag.l(I)I")
    public int method308() {
        return this.field233;
    }

    @ObfuscatedName("ag.o(B)I")
    public int method309() {
        return this.field236;
    }

    @ObfuscatedName("ag.u(I)I")
    public int method344() {
        return this.field237;
    }

    @ObfuscatedName("ag.y(I)I")
    public int method311() {
        return this.field232.field2650;
    }

    @ObfuscatedName("ag.k(I)I")
    public int method312() {
        return this.field232.field2652;
    }

    @ObfuscatedName("ag.v(I)I")
    public int method304() {
        return this.field232.field2649;
    }

    @ObfuscatedName("ag.c(I)Lif;")
    public class235 method310() {
        return new class235(this.field232);
    }
}
