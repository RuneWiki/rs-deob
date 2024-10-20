package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("al")
public class class27 {

    @ObfuscatedName("al.q")
    public int field222 = -1;

    @ObfuscatedName("al.w")
    public String field215;

    @ObfuscatedName("al.e")
    public String field220;

    @ObfuscatedName("al.p")
    public int field217 = -1;

    @ObfuscatedName("al.k")
    public int field229 = -1;

    @ObfuscatedName("al.l")
    public class214 field219 = null;

    @ObfuscatedName("al.b")
    public int field218 = Integer.MAX_VALUE;

    @ObfuscatedName("al.i")
    public int field224 = 0;

    @ObfuscatedName("al.c")
    public int field221 = Integer.MAX_VALUE;

    @ObfuscatedName("al.f")
    public int field223 = 0;

    @ObfuscatedName("al.m")
    public boolean field216 = false;

    @ObfuscatedName("al.u")
    public LinkedList field225;

    @ObfuscatedName("al.q(Lkf;IB)V")
    public void method288(class301 arg0, int arg1) {
        this.field222 = arg1;
        this.field215 = arg0.method5076();
        this.field220 = arg0.method5076();
        this.field219 = new class214(arg0.method5072());
        this.field217 = arg0.method5072();
        arg0.method5077();
        this.field216 = arg0.method5077() == 1;
        this.field229 = arg0.method5077();
        int var3 = arg0.method5077();
        this.field225 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field225.add(this.method271(arg0));
        }
        this.method276();
    }

    @ObfuscatedName("al.w(Lkf;I)Laj;")
    public class38 method271(class301 arg0) {
        int var2 = arg0.method5077();
        class21[] var3 = new class21[] { class21.field148, class21.field150, class21.field149, class21.field147 };
        class21 var4 = (class21) class196.method2257(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field151) {
            case 0:
                var6 = new class20();
                break;
            case 1:
                var6 = new class25();
                break;
            case 2:
                var6 = new class34();
                break;
            case 3:
                var6 = new class43();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method203(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("al.e(IIII)Z")
    public boolean method317(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field225.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method199(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("al.p(III)Z")
    public boolean method273(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field218 || var3 > this.field224) {
            return false;
        } else if (var4 >= this.field221 && var4 <= this.field223) {
            Iterator var5 = this.field225.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method213(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.k(IIII)[I")
    public int[] method274(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field225.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method199(arg0, arg1, arg2));
        return var5.method201(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.l(III)Lhv;")
    public class214 method275(int arg0, int arg1) {
        Iterator var3 = this.field225.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method213(arg0, arg1));
        return var4.method215(arg0, arg1);
    }

    @ObfuscatedName("al.b(I)V")
    public void method276() {
        Iterator var1 = this.field225.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method198(this);
        }
    }

    @ObfuscatedName("al.i(B)I")
    public int method291() {
        return this.field222;
    }

    @ObfuscatedName("al.c(I)Z")
    public boolean method278() {
        return this.field216;
    }

    @ObfuscatedName("al.u(I)Ljava/lang/String;")
    public String method313() {
        return this.field215;
    }

    @ObfuscatedName("al.x(I)Ljava/lang/String;")
    public String method279() {
        return this.field220;
    }

    @ObfuscatedName("al.r(B)I")
    public int method269() {
        return this.field217;
    }

    @ObfuscatedName("al.v(I)I")
    public int method281() {
        return this.field229;
    }

    @ObfuscatedName("al.y(I)I")
    public int method282() {
        return this.field218;
    }

    @ObfuscatedName("al.g(I)I")
    public int method283() {
        return this.field224;
    }

    @ObfuscatedName("al.a(I)I")
    public int method284() {
        return this.field221;
    }

    @ObfuscatedName("al.j(I)I")
    public int method285() {
        return this.field223;
    }

    @ObfuscatedName("al.o(B)I")
    public int method286() {
        return this.field219.field2531;
    }

    @ObfuscatedName("al.d(I)I")
    public int method287() {
        return this.field219.field2532;
    }

    @ObfuscatedName("al.s(B)I")
    public int method349() {
        return this.field219.field2529;
    }

    @ObfuscatedName("al.z(I)Lhv;")
    public class214 method289() {
        return new class214(this.field219);
    }
}
