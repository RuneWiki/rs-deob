package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.n")
    public int field468 = -1;

    @ObfuscatedName("al.p")
    public String field459;

    @ObfuscatedName("al.i")
    public String field460;

    @ObfuscatedName("al.j")
    public int field465 = -1;

    @ObfuscatedName("al.f")
    public int field458 = -1;

    @ObfuscatedName("al.m")
    public class213 field463 = null;

    @ObfuscatedName("al.c")
    public int field461 = Integer.MAX_VALUE;

    @ObfuscatedName("al.z")
    public int field469 = 0;

    @ObfuscatedName("al.h")
    public int field466 = Integer.MAX_VALUE;

    @ObfuscatedName("al.g")
    public int field467 = 0;

    @ObfuscatedName("al.e")
    public boolean field464 = false;

    @ObfuscatedName("al.o")
    public LinkedList field462;

    @ObfuscatedName("al.n(Lfl;II)V")
    public void method256(class174 arg0, int arg1) {
        this.field468 = arg1;
        this.field459 = arg0.method3098();
        this.field460 = arg0.method3098();
        this.field463 = new class213(arg0.method3058());
        this.field465 = arg0.method3058();
        arg0.method2925();
        this.field464 = arg0.method2925() == 1;
        this.field458 = arg0.method2925();
        int var3 = arg0.method2925();
        this.field462 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field462.add(this.method257(arg0));
        }
        this.method262();
    }

    @ObfuscatedName("al.p(Lfl;I)Lav;")
    public class43 method257(class174 arg0) {
        int var2 = arg0.method2925();
        class28[] var3 = new class28[] { class28.field403, class28.field402, class28.field404, class28.field406 };
        class28 var4 = (class28) class169.method1611(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field401) {
            case 0:
                var6 = new class49();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class27();
                break;
            case 3:
                var6 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method201(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("al.i(IIII)Z")
    public boolean method258(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field462.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method210(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("al.j(IIB)Z")
    public boolean method259(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field461 || var3 > this.field469) {
            return false;
        } else if (var4 >= this.field466 && var4 <= this.field467) {
            Iterator var5 = this.field462.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method198(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.f(IIII)[I")
    public int[] method303(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field462.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method210(arg0, arg1, arg2));
        return var5.method195(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.m(IIB)Lhl;")
    public class213 method261(int arg0, int arg1) {
        Iterator var3 = this.field462.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method198(arg0, arg1));
        return var4.method211(arg0, arg1);
    }

    @ObfuscatedName("al.c(I)V")
    public void method262() {
        Iterator var1 = this.field462.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method214(this);
        }
    }

    @ObfuscatedName("al.z(I)I")
    public int method263() {
        return this.field468;
    }

    @ObfuscatedName("al.h(I)Z")
    public boolean method323() {
        return this.field464;
    }

    @ObfuscatedName("al.g(S)Ljava/lang/String;")
    public String method264() {
        return this.field459;
    }

    @ObfuscatedName("al.e(B)Ljava/lang/String;")
    public String method266() {
        return this.field460;
    }

    @ObfuscatedName("al.o(I)I")
    public int method267() {
        return this.field465;
    }

    @ObfuscatedName("al.x(S)I")
    public int method268() {
        return this.field458;
    }

    @ObfuscatedName("al.a(I)I")
    public int method269() {
        return this.field461;
    }

    @ObfuscatedName("al.y(S)I")
    public int method289() {
        return this.field469;
    }

    @ObfuscatedName("al.r(I)I")
    public int method297() {
        return this.field466;
    }

    @ObfuscatedName("al.b(S)I")
    public int method272() {
        return this.field467;
    }

    @ObfuscatedName("al.s(I)I")
    public int method288() {
        return this.field463.field2621;
    }

    @ObfuscatedName("al.v(I)I")
    public int method274() {
        return this.field463.field2619;
    }

    @ObfuscatedName("al.t(I)I")
    public int method275() {
        return this.field463.field2618;
    }

    @ObfuscatedName("al.w(I)Lhl;")
    public class213 method310() {
        return new class213(this.field463);
    }
}
