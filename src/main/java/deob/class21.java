package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("p")
public class class21 {

    @ObfuscatedName("p.f")
    public int field173 = -1;

    @ObfuscatedName("p.h")
    public String field166;

    @ObfuscatedName("p.e")
    public String field176;

    @ObfuscatedName("p.b")
    public int field165 = -1;

    @ObfuscatedName("p.l")
    public int field169 = -1;

    @ObfuscatedName("p.w")
    public class229 field168 = null;

    @ObfuscatedName("p.d")
    public int field171 = Integer.MAX_VALUE;

    @ObfuscatedName("p.n")
    public int field172 = 0;

    @ObfuscatedName("p.s")
    public int field170 = Integer.MAX_VALUE;

    @ObfuscatedName("p.g")
    public int field174 = 0;

    @ObfuscatedName("p.a")
    public boolean field167 = false;

    @ObfuscatedName("p.r")
    public LinkedList field175;

    @ObfuscatedName("p.f(Lgx;II)V")
    public void method270(class185 arg0, int arg1) {
        this.field173 = arg1;
        this.field166 = arg0.method3435();
        this.field176 = arg0.method3435();
        this.field168 = new class229(arg0.method3328());
        this.field165 = arg0.method3328();
        arg0.method3323();
        this.field167 = arg0.method3323() == 1;
        this.field169 = arg0.method3323();
        int var3 = arg0.method3323();
        this.field175 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field175.add(this.method224(arg0));
        }
        this.method290();
    }

    @ObfuscatedName("p.h(Lgx;I)Laa;")
    public class32 method224(class185 arg0) {
        int var2 = arg0.method3323();
        class16[] var3 = new class16[] { class16.field115, class16.field117, class16.field116, class16.field121 };
        class16 var4 = (class16) class180.method3213(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field114) {
            case 0:
                var6 = new class38();
                break;
            case 1:
                var6 = new class19();
                break;
            case 2:
                var6 = new class28();
                break;
            case 3:
                var6 = new class15();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var6).method155(arg0);
        return (class32) var6;
    }

    @ObfuscatedName("p.e(IIIB)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field175.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method151(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("p.b(IIB)Z")
    public boolean method231(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field171 || var3 > this.field172) {
            return false;
        } else if (var4 >= this.field170 && var4 <= this.field174) {
            Iterator var5 = this.field175.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method152(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.l(IIII)[I")
    public int[] method232(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field175.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method151(arg0, arg1, arg2));
        return var5.method150(arg0, arg1, arg2);
    }

    @ObfuscatedName("p.w(III)Lhc;")
    public class229 method289(int arg0, int arg1) {
        Iterator var3 = this.field175.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method152(arg0, arg1));
        return var4.method177(arg0, arg1);
    }

    @ObfuscatedName("p.d(I)V")
    public void method290() {
        Iterator var1 = this.field175.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method162(this);
        }
    }

    @ObfuscatedName("p.n(B)I")
    public int method230() {
        return this.field173;
    }

    @ObfuscatedName("p.s(I)Z")
    public boolean method245() {
        return this.field167;
    }

    @ObfuscatedName("p.g(I)Ljava/lang/String;")
    public String method285() {
        return this.field166;
    }

    @ObfuscatedName("p.k(I)Ljava/lang/String;")
    public String method233() {
        return this.field176;
    }

    @ObfuscatedName("p.m(S)I")
    public int method234() {
        return this.field165;
    }

    @ObfuscatedName("p.q(I)I")
    public int method227() {
        return this.field169;
    }

    @ObfuscatedName("p.x(I)I")
    public int method236() {
        return this.field171;
    }

    @ObfuscatedName("p.u(I)I")
    public int method237() {
        return this.field172;
    }

    @ObfuscatedName("p.o(B)I")
    public int method241() {
        return this.field170;
    }

    @ObfuscatedName("p.t(I)I")
    public int method239() {
        return this.field174;
    }

    @ObfuscatedName("p.v(I)I")
    public int method246() {
        return this.field168.field2620;
    }

    @ObfuscatedName("p.p(B)I")
    public int method243() {
        return this.field168.field2623;
    }

    @ObfuscatedName("p.z(B)I")
    public int method242() {
        return this.field168.field2621;
    }

    @ObfuscatedName("p.j(B)Lhc;")
    public class229 method255() {
        return new class229(this.field168);
    }
}
