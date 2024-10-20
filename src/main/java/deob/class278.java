package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jb")
public abstract class class278 {

    @ObfuscatedName("jb.p")
    public final int field3628;

    @ObfuscatedName("jb.k")
    public int field3624 = 0;

    @ObfuscatedName("jb.l")
    public class275[] field3625;

    @ObfuscatedName("jb.b")
    public HashMap field3627;

    @ObfuscatedName("jb.i")
    public HashMap field3626;

    @ObfuscatedName("jb.c")
    public Comparator field3623 = null;

    public class278(int arg0) {
        this.field3628 = arg0;
        this.field3625 = this.method4685(arg0);
        this.field3627 = new HashMap(arg0 / 8);
        this.field3626 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jb.x(I)V")
    public void method4708() {
        this.field3624 = 0;
        Arrays.fill(this.field3625, (Object) null);
        this.field3627.clear();
        this.field3626.clear();
    }

    @ObfuscatedName("jb.r(I)I")
    public int method4694() {
        return this.field3624;
    }

    @ObfuscatedName("jb.v(I)Z")
    public boolean method4717() {
        return this.field3628 == this.field3624;
    }

    @ObfuscatedName("jb.y(Ljv;I)Z")
    public boolean method4695(class284 arg0) {
        if (arg0.method4798()) {
            return this.field3627.containsKey(arg0) ? true : this.field3626.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jb.g(Ljv;B)Ljd;")
    public class275 method4696(class284 arg0) {
        class275 var2 = this.method4746(arg0);
        return var2 == null ? this.method4698(arg0) : var2;
    }

    @ObfuscatedName("jb.a(Ljv;I)Ljd;")
    public class275 method4746(class284 arg0) {
        return arg0.method4798() ? (class275) this.field3627.get(arg0) : null;
    }

    @ObfuscatedName("jb.j(Ljv;B)Ljd;")
    public class275 method4698(class284 arg0) {
        return arg0.method4798() ? (class275) this.field3626.get(arg0) : null;
    }

    @ObfuscatedName("jb.o(Ljv;B)Z")
    public final boolean method4699(class284 arg0) {
        class275 var2 = this.method4746(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4700(var2);
            return true;
        }
    }

    @ObfuscatedName("jb.d(Ljd;I)V")
    public final void method4700(class275 arg0) {
        int var2 = this.method4713(arg0);
        if (var2 != -1) {
            this.method4710(var2);
            this.method4705(arg0);
        }
    }

    @ObfuscatedName("jb.s(Ljv;B)Ljd;")
    public class275 method4701(class284 arg0) {
        return this.method4702(arg0, (class284) null);
    }

    @ObfuscatedName("jb.z(Ljv;Ljv;B)Ljd;")
    public class275 method4702(class284 arg0, class284 arg1) {
        if (this.method4746(arg0) != null) {
            throw new IllegalStateException();
        }
        class275 var3 = this.method4683();
        var3.method4663(arg0, arg1);
        this.method4738(var3);
        this.method4707(var3);
        return var3;
    }

    @ObfuscatedName("jb.al(II)Ljd;")
    public final class275 method4759(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3624) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3625[arg0];
    }

    @ObfuscatedName("jb.av(S)V")
    public final void method4742() {
        if (this.field3623 == null) {
            Arrays.sort(this.field3625, 0, this.field3624);
        } else {
            Arrays.sort(this.field3625, 0, this.field3624, this.field3623);
        }
    }

    @ObfuscatedName("jb.as(Ljd;Ljv;Ljv;I)V")
    public final void method4697(class275 arg0, class284 arg1, class284 arg2) {
        this.method4705(arg0);
        arg0.method4663(arg1, arg2);
        this.method4707(arg0);
    }

    @ObfuscatedName("jb.aw(Ljd;I)I")
    public final int method4713(class275 arg0) {
        for (int var2 = 0; var2 < this.field3624; var2++) {
            if (this.field3625[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jb.ad(Ljd;I)V")
    public final void method4705(class275 arg0) {
        if (this.field3627.remove(arg0.field3616) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3615 != null) {
            this.field3626.remove(arg0.field3615);
        }
    }

    @ObfuscatedName("jb.ag(Ljd;B)V")
    public final void method4738(class275 arg0) {
        this.field3625[++this.field3624 - 1] = arg0;
    }

    @ObfuscatedName("jb.ar(Ljd;B)V")
    public final void method4707(class275 arg0) {
        this.field3627.put(arg0.field3616, arg0);
        if (arg0.field3615 != null) {
            class275 var2 = (class275) this.field3626.put(arg0.field3615, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3615 = null;
            }
        }
    }

    @ObfuscatedName("jb.ax(IB)V")
    public final void method4710(int arg0) {
        this.field3624--;
        if (arg0 < this.field3624) {
            System.arraycopy(this.field3625, arg0 + 1, this.field3625, arg0, this.field3624 - arg0);
        }
    }

    @ObfuscatedName("jb.az(I)V")
    public final void method4711() {
        this.field3623 = null;
    }

    @ObfuscatedName("jb.ae(Ljava/util/Comparator;I)V")
    public final void method4712(Comparator arg0) {
        if (this.field3623 == null) {
            this.field3623 = arg0;
        } else if (this.field3623 instanceof class276) {
            ((class276) this.field3623).method4675(arg0);
        }
    }

    @ObfuscatedName("jb.q(I)Ljd;")
    public abstract class275 method4683();

    @ObfuscatedName("jb.w(II)[Ljd;")
    public abstract class275[] method4685(int arg0);
}
