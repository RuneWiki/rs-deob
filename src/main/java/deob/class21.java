package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("h")
public class class21 {

    @ObfuscatedName("h.f")
    public int field195 = -1;

    @ObfuscatedName("h.l")
    public String field186;

    @ObfuscatedName("h.w")
    public String field193;

    @ObfuscatedName("h.s")
    public int field188 = -1;

    @ObfuscatedName("h.e")
    public int field196 = -1;

    @ObfuscatedName("h.a")
    public class229 field190 = null;

    @ObfuscatedName("h.c")
    public int field191 = Integer.MAX_VALUE;

    @ObfuscatedName("h.p")
    public int field192 = 0;

    @ObfuscatedName("h.r")
    public int field187 = Integer.MAX_VALUE;

    @ObfuscatedName("h.m")
    public int field194 = 0;

    @ObfuscatedName("h.d")
    public boolean field185 = false;

    @ObfuscatedName("h.z")
    public LinkedList field189;

    @ObfuscatedName("h.f(Lgm;II)V")
    public void method218(class185 arg0, int arg1) {
        this.field195 = arg1;
        this.field186 = arg0.method3353();
        this.field193 = arg0.method3353();
        this.field190 = new class229(arg0.method3432());
        this.field188 = arg0.method3432();
        arg0.method3344();
        this.field185 = arg0.method3344() == 1;
        this.field196 = arg0.method3344();
        int var3 = arg0.method3344();
        this.field189 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field189.add(this.method194(arg0));
        }
        this.method199();
    }

    @ObfuscatedName("h.l(Lgm;I)Lac;")
    public class32 method194(class185 arg0) {
        int var2 = arg0.method3344();
        class16[] var3 = new class16[] { class16.field133, class16.field140, class16.field131, class16.field130 };
        class16 var4 = (class16) Statics.method1912(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field129) {
            case 0:
                var6 = new class28();
                break;
            case 1:
                var6 = new class19();
                break;
            case 2:
                var6 = new class38();
                break;
            case 3:
                var6 = new class15();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var6).method126(arg0);
        return (class32) var6;
    }

    @ObfuscatedName("h.w(IIII)Z")
    public boolean method195(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field189.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method122(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("h.s(III)Z")
    public boolean method196(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field191 || var3 > this.field192) {
            return false;
        } else if (var4 >= this.field187 && var4 <= this.field194) {
            Iterator var5 = this.field189.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method131(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.e(IIII)[I")
    public int[] method197(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field189.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method122(arg0, arg1, arg2));
        return var5.method124(arg0, arg1, arg2);
    }

    @ObfuscatedName("h.c(III)Lhx;")
    public class229 method217(int arg0, int arg1) {
        Iterator var3 = this.field189.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method131(arg0, arg1));
        return var4.method125(arg0, arg1);
    }

    @ObfuscatedName("h.p(I)V")
    public void method199() {
        Iterator var1 = this.field189.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method121(this);
        }
    }

    @ObfuscatedName("h.r(S)I")
    public int method231() {
        return this.field195;
    }

    @ObfuscatedName("h.m(I)Z")
    public boolean method246() {
        return this.field185;
    }

    @ObfuscatedName("h.d(I)Ljava/lang/String;")
    public String method202() {
        return this.field186;
    }

    @ObfuscatedName("h.z(I)Ljava/lang/String;")
    public String method203() {
        return this.field193;
    }

    @ObfuscatedName("h.x(B)I")
    public int method198() {
        return this.field188;
    }

    @ObfuscatedName("h.v(B)I")
    public int method230() {
        return this.field196;
    }

    @ObfuscatedName("h.g(I)I")
    public int method206() {
        return this.field191;
    }

    @ObfuscatedName("h.u(B)I")
    public int method207() {
        return this.field192;
    }

    @ObfuscatedName("h.o(I)I")
    public int method239() {
        return this.field187;
    }

    @ObfuscatedName("h.i(I)I")
    public int method209() {
        return this.field194;
    }

    @ObfuscatedName("h.k(I)I")
    public int method210() {
        return this.field190.field2634;
    }

    @ObfuscatedName("h.q(I)I")
    public int method211() {
        return this.field190.field2633;
    }

    @ObfuscatedName("h.y(B)I")
    public int method238() {
        return this.field190.field2632;
    }

    @ObfuscatedName("h.av(I)Lhx;")
    public class229 method240() {
        return new class229(this.field190);
    }
}
