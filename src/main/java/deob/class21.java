package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("k")
public class class21 {

    @ObfuscatedName("k.g")
    public int field201 = -1;

    @ObfuscatedName("k.r")
    public String field202;

    @ObfuscatedName("k.e")
    public String field193;

    @ObfuscatedName("k.q")
    public int field196 = -1;

    @ObfuscatedName("k.c")
    public int field197 = -1;

    @ObfuscatedName("k.l")
    public class229 field198 = null;

    @ObfuscatedName("k.b")
    public int field199 = Integer.MAX_VALUE;

    @ObfuscatedName("k.w")
    public int field200 = 0;

    @ObfuscatedName("k.n")
    public int field195 = Integer.MAX_VALUE;

    @ObfuscatedName("k.i")
    public int field204 = 0;

    @ObfuscatedName("k.p")
    public boolean field203 = false;

    @ObfuscatedName("k.m")
    public LinkedList field194;

    @ObfuscatedName("k.g(Lgl;II)V")
    public void method243(class185 arg0, int arg1) {
        this.field201 = arg1;
        this.field202 = arg0.method3474();
        this.field193 = arg0.method3474();
        this.field198 = new class229(arg0.method3588());
        this.field196 = arg0.method3588();
        arg0.method3679();
        this.field203 = arg0.method3679() == 1;
        this.field197 = arg0.method3679();
        int var3 = arg0.method3679();
        this.field194 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field194.add(this.method228(arg0));
        }
        this.method270();
    }

    @ObfuscatedName("k.r(Lgl;I)Lac;")
    public class32 method228(class185 arg0) {
        int var2 = arg0.method3679();
        class16 var3 = (class16) class180.method712(class16.method171(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field138) {
            case 0:
                var5 = new class15();
                break;
            case 1:
                var5 = new class28();
                break;
            case 2:
                var5 = new class38();
                break;
            case 3:
                var5 = new class19();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var5).method151(arg0);
        return (class32) var5;
    }

    @ObfuscatedName("k.e(IIII)Z")
    public boolean method229(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field194.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method148(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("k.q(IIB)Z")
    public boolean method230(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field199 || var3 > this.field200) {
            return false;
        } else if (var4 >= this.field195 && var4 <= this.field204) {
            Iterator var5 = this.field194.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method149(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("k.c(IIII)[I")
    public int[] method231(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field194.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method148(arg0, arg1, arg2));
        return var5.method150(arg0, arg1, arg2);
    }

    @ObfuscatedName("k.i(III)Lhz;")
    public class229 method260(int arg0, int arg1) {
        Iterator var3 = this.field194.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method149(arg0, arg1));
        return var4.method153(arg0, arg1);
    }

    @ObfuscatedName("k.p(I)V")
    public void method270() {
        Iterator var1 = this.field194.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method147(this);
        }
    }

    @ObfuscatedName("k.m(B)I")
    public int method234() {
        return this.field201;
    }

    @ObfuscatedName("k.d(I)Z")
    public boolean method235() {
        return this.field203;
    }

    @ObfuscatedName("k.j(B)Ljava/lang/String;")
    public String method245() {
        return this.field202;
    }

    @ObfuscatedName("k.x(I)Ljava/lang/String;")
    public String method248() {
        return this.field193;
    }

    @ObfuscatedName("k.v(I)I")
    public int method238() {
        return this.field196;
    }

    @ObfuscatedName("k.h(B)I")
    public int method239() {
        return this.field197;
    }

    @ObfuscatedName("k.f(B)I")
    public int method261() {
        return this.field199;
    }

    @ObfuscatedName("k.a(I)I")
    public int method241() {
        return this.field200;
    }

    @ObfuscatedName("k.t(B)I")
    public int method232() {
        return this.field195;
    }

    @ObfuscatedName("k.k(B)I")
    public int method252() {
        return this.field204;
    }

    @ObfuscatedName("k.s(I)I")
    public int method284() {
        return this.field198.field2633;
    }

    @ObfuscatedName("k.y(I)I")
    public int method237() {
        return this.field198.field2635;
    }

    @ObfuscatedName("k.u(I)I")
    public int method246() {
        return this.field198.field2634;
    }

    @ObfuscatedName("k.o(B)Lhz;")
    public class229 method247() {
        return new class229(this.field198);
    }
}
