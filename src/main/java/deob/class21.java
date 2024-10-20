package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("i")
public class class21 {

    @ObfuscatedName("i.w")
    public int field181 = -1;

    @ObfuscatedName("i.m")
    public String field174;

    @ObfuscatedName("i.q")
    public String field173;

    @ObfuscatedName("i.b")
    public int field172 = -1;

    @ObfuscatedName("i.f")
    public int field175 = -1;

    @ObfuscatedName("i.n")
    public class227 field176 = null;

    @ObfuscatedName("i.h")
    public int field177 = Integer.MAX_VALUE;

    @ObfuscatedName("i.x")
    public int field178 = 0;

    @ObfuscatedName("i.j")
    public int field179 = Integer.MAX_VALUE;

    @ObfuscatedName("i.a")
    public int field180 = 0;

    @ObfuscatedName("i.l")
    public boolean field183 = false;

    @ObfuscatedName("i.d")
    public LinkedList field182;

    @ObfuscatedName("i.w(Lgy;II)V")
    public void method202(class183 arg0, int arg1) {
        this.field181 = arg1;
        this.field174 = arg0.method3271();
        this.field173 = arg0.method3271();
        this.field176 = new class227(arg0.method3267());
        this.field172 = arg0.method3267();
        arg0.method3436();
        this.field183 = arg0.method3436() == 1;
        this.field175 = arg0.method3436();
        int var3 = arg0.method3436();
        this.field182 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field182.add(this.method212(arg0));
        }
        this.method208();
    }

    @ObfuscatedName("i.m(Lgy;I)Lan;")
    public class32 method212(class183 arg0) {
        int var2 = arg0.method3436();
        class16 var3 = (class16) class178.method90(class16.method163(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field127) {
            case 0:
                var5 = new class38();
                break;
            case 1:
                var5 = new class15();
                break;
            case 2:
                var5 = new class28();
                break;
            case 3:
                var5 = new class19();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var5).method129(arg0);
        return (class32) var5;
    }

    @ObfuscatedName("i.q(IIII)Z")
    public boolean method204(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field182.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method127(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("i.x(III)Z")
    public boolean method205(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field177 || var3 > this.field178) {
            return false;
        } else if (var4 >= this.field179 && var4 <= this.field180) {
            Iterator var5 = this.field182.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method130(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.j(IIII)[I")
    public int[] method259(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field182.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method127(arg0, arg1, arg2));
        return var5.method131(arg0, arg1, arg2);
    }

    @ObfuscatedName("i.a(III)Lhh;")
    public class227 method207(int arg0, int arg1) {
        Iterator var3 = this.field182.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method130(arg0, arg1));
        return var4.method133(arg0, arg1);
    }

    @ObfuscatedName("i.l(B)V")
    public void method208() {
        Iterator var1 = this.field182.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method128(this);
        }
    }

    @ObfuscatedName("i.d(I)I")
    public int method209() {
        return this.field181;
    }

    @ObfuscatedName("i.s(I)Z")
    public boolean method243() {
        return this.field183;
    }

    @ObfuscatedName("i.p(I)Ljava/lang/String;")
    public String method211() {
        return this.field174;
    }

    @ObfuscatedName("i.g(B)Ljava/lang/String;")
    public String method232() {
        return this.field173;
    }

    @ObfuscatedName("i.y(I)I")
    public int method213() {
        return this.field172;
    }

    @ObfuscatedName("i.c(I)I")
    public int method225() {
        return this.field175;
    }

    @ObfuscatedName("i.e(I)I")
    public int method201() {
        return this.field177;
    }

    @ObfuscatedName("i.t(B)I")
    public int method216() {
        return this.field178;
    }

    @ObfuscatedName("i.u(I)I")
    public int method270() {
        return this.field179;
    }

    @ObfuscatedName("i.i(I)I")
    public int method248() {
        return this.field180;
    }

    @ObfuscatedName("i.r(S)I")
    public int method219() {
        return this.field176.field2582;
    }

    @ObfuscatedName("i.v(B)I")
    public int method220() {
        return this.field176.field2588;
    }

    @ObfuscatedName("i.o(I)I")
    public int method221() {
        return this.field176.field2584;
    }

    @ObfuscatedName("i.ai(I)Lhh;")
    public class227 method222() {
        return new class227(this.field176);
    }
}
