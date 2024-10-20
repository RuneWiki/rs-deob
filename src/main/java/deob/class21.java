package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("h")
public class class21 {

    @ObfuscatedName("h.v")
    public int field188 = -1;

    @ObfuscatedName("h.s")
    public String field179;

    @ObfuscatedName("h.o")
    public String field175;

    @ObfuscatedName("h.k")
    public int field176 = -1;

    @ObfuscatedName("h.u")
    public int field177 = -1;

    @ObfuscatedName("h.i")
    public class229 field174 = null;

    @ObfuscatedName("h.t")
    public int field173 = Integer.MAX_VALUE;

    @ObfuscatedName("h.p")
    public int field178 = 0;

    @ObfuscatedName("h.l")
    public int field181 = Integer.MAX_VALUE;

    @ObfuscatedName("h.b")
    public int field182 = 0;

    @ObfuscatedName("h.c")
    public boolean field183 = false;

    @ObfuscatedName("h.d")
    public LinkedList field189;

    @ObfuscatedName("h.v(Lgx;II)V")
    public void method258(class185 arg0, int arg1) {
        this.field188 = arg1;
        this.field179 = arg0.method3490();
        this.field175 = arg0.method3490();
        this.field174 = new class229(arg0.method3279());
        this.field176 = arg0.method3279();
        arg0.method3274();
        this.field183 = arg0.method3274() == 1;
        this.field177 = arg0.method3274();
        int var3 = arg0.method3274();
        this.field189 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field189.add(this.method224(arg0));
        }
        this.method229();
    }

    @ObfuscatedName("h.s(Lgx;I)Lav;")
    public class32 method224(class185 arg0) {
        int var2 = arg0.method3274();
        class16 var3 = (class16) class180.method34(class16.method183(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field127) {
            case 0:
                var5 = new class28();
                break;
            case 1:
                var5 = new class15();
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
        ((class32) var5).method152(arg0);
        return (class32) var5;
    }

    @ObfuscatedName("h.o(IIII)Z")
    public boolean method257(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field189.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method167(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("h.k(III)Z")
    public boolean method260(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field173 || var3 > this.field178) {
            return false;
        } else if (var4 >= this.field181 && var4 <= this.field182) {
            Iterator var5 = this.field189.iterator();
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

    @ObfuscatedName("h.u(IIII)[I")
    public int[] method225(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field189.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method167(arg0, arg1, arg2));
        return var5.method150(arg0, arg1, arg2);
    }

    @ObfuscatedName("h.i(III)Lhv;")
    public class229 method241(int arg0, int arg1) {
        Iterator var3 = this.field189.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method149(arg0, arg1));
        return var4.method151(arg0, arg1);
    }

    @ObfuscatedName("h.t(I)V")
    public void method229() {
        Iterator var1 = this.field189.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method147(this);
        }
    }

    @ObfuscatedName("h.c(I)I")
    public int method293() {
        return this.field188;
    }

    @ObfuscatedName("h.w(I)Z")
    public boolean method231() {
        return this.field183;
    }

    @ObfuscatedName("h.a(I)Ljava/lang/String;")
    public String method232() {
        return this.field179;
    }

    @ObfuscatedName("h.z(I)Ljava/lang/String;")
    public String method233() {
        return this.field175;
    }

    @ObfuscatedName("h.e(I)I")
    public int method234() {
        return this.field176;
    }

    @ObfuscatedName("h.q(I)I")
    public int method273() {
        return this.field177;
    }

    @ObfuscatedName("h.j(I)I")
    public int method236() {
        return this.field173;
    }

    @ObfuscatedName("h.y(I)I")
    public int method279() {
        return this.field178;
    }

    @ObfuscatedName("h.m(B)I")
    public int method238() {
        return this.field181;
    }

    @ObfuscatedName("h.h(I)I")
    public int method239() {
        return this.field182;
    }

    @ObfuscatedName("h.x(I)I")
    public int method240() {
        return this.field174.field2603;
    }

    @ObfuscatedName("h.f(I)I")
    public int method223() {
        return this.field174.field2606;
    }

    @ObfuscatedName("h.r(I)I")
    public int method242() {
        return this.field174.field2605;
    }

    @ObfuscatedName("h.n(B)Lhv;")
    public class229 method243() {
        return new class229(this.field174);
    }
}
