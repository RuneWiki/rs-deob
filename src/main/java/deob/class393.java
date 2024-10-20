package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("on")
public abstract class class393 {

    @ObfuscatedName("on.n")
    public final int field4489;

    @ObfuscatedName("on.r")
    public int field4492 = 0;

    @ObfuscatedName("on.l")
    public class391[] field4488;

    @ObfuscatedName("on.s")
    public HashMap field4487;

    @ObfuscatedName("on.p")
    public HashMap field4486;

    @ObfuscatedName("on.b")
    public Comparator field4491 = null;

    public class393(int arg0) {
        this.field4489 = arg0;
        this.field4488 = this.method6650(arg0);
        this.field4487 = new HashMap(arg0 / 8);
        this.field4486 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("on.ac(I)V")
    public void method6756() {
        this.field4492 = 0;
        Arrays.fill(this.field4488, (Object) null);
        this.field4487.clear();
        this.field4486.clear();
    }

    @ObfuscatedName("on.af(I)I")
    public int method6803() {
        return this.field4492;
    }

    @ObfuscatedName("on.ad(I)Z")
    public boolean method6793() {
        return this.field4492 == this.field4489;
    }

    @ObfuscatedName("on.av(Lrg;I)Z")
    public boolean method6823(class486 arg0) {
        if (arg0.method8296()) {
            return this.field4487.containsKey(arg0) ? true : this.field4486.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("on.ak(Lrg;B)Loj;")
    public class391 method6760(class486 arg0) {
        class391 var2 = this.method6761(arg0);
        return var2 == null ? this.method6774(arg0) : var2;
    }

    @ObfuscatedName("on.ae(Lrg;B)Loj;")
    public class391 method6761(class486 arg0) {
        return arg0.method8296() ? (class391) this.field4487.get(arg0) : null;
    }

    @ObfuscatedName("on.ap(Lrg;I)Loj;")
    public class391 method6774(class486 arg0) {
        return arg0.method8296() ? (class391) this.field4486.get(arg0) : null;
    }

    @ObfuscatedName("on.as(Lrg;B)Z")
    public final boolean method6763(class486 arg0) {
        class391 var2 = this.method6761(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6764(var2);
            return true;
        }
    }

    @ObfuscatedName("on.aq(Loj;I)V")
    public final void method6764(class391 arg0) {
        int var2 = this.method6801(arg0);
        if (var2 != -1) {
            this.method6824(var2);
            this.method6771(arg0);
        }
    }

    @ObfuscatedName("on.al(Lrg;I)Loj;")
    public class391 method6755(class486 arg0) {
        return this.method6766(arg0, (class486) null);
    }

    @ObfuscatedName("on.ag(Lrg;Lrg;I)Loj;")
    public class391 method6766(class486 arg0, class486 arg1) {
        if (this.method6761(arg0) != null) {
            throw new IllegalStateException();
        }
        class391 var3 = this.method6649();
        var3.method6730(arg0, arg1);
        this.method6772(var3);
        this.method6804(var3);
        return var3;
    }

    @ObfuscatedName("on.am(II)Loj;")
    public final class391 method6767(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4492) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4488[arg0];
    }

    @ObfuscatedName("on.az(I)V")
    public final void method6768() {
        if (this.field4491 == null) {
            Arrays.sort(this.field4488, 0, this.field4492);
        } else {
            Arrays.sort(this.field4488, 0, this.field4492, this.field4491);
        }
    }

    @ObfuscatedName("on.ab(Loj;Lrg;Lrg;I)V")
    public final void method6811(class391 arg0, class486 arg1, class486 arg2) {
        this.method6771(arg0);
        arg0.method6730(arg1, arg2);
        this.method6804(arg0);
    }

    @ObfuscatedName("on.ai(Loj;I)I")
    public final int method6801(class391 arg0) {
        for (int var2 = 0; var2 < this.field4492; var2++) {
            if (this.field4488[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("on.au(Loj;I)V")
    public final void method6771(class391 arg0) {
        if (this.field4487.remove(arg0.field4482) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4483 != null) {
            this.field4486.remove(arg0.field4483);
        }
    }

    @ObfuscatedName("on.aw(Loj;I)V")
    public final void method6772(class391 arg0) {
        this.field4488[++this.field4492 - 1] = arg0;
    }

    @ObfuscatedName("on.at(Loj;B)V")
    public final void method6804(class391 arg0) {
        this.field4487.put(arg0.field4482, arg0);
        if (arg0.field4483 != null) {
            class391 var2 = (class391) this.field4486.put(arg0.field4483, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4483 = null;
            }
        }
    }

    @ObfuscatedName("on.ar(II)V")
    public final void method6824(int arg0) {
        this.field4492--;
        if (arg0 < this.field4492) {
            System.arraycopy(this.field4488, arg0 + 1, this.field4488, arg0, this.field4492 - arg0);
        }
    }

    @ObfuscatedName("on.ay(B)V")
    public final void method6806() {
        this.field4491 = null;
    }

    @ObfuscatedName("on.ax(Ljava/util/Comparator;I)V")
    public final void method6776(Comparator arg0) {
        if (this.field4491 == null) {
            this.field4491 = arg0;
        } else if (this.field4491 instanceof class392) {
            ((class392) this.field4491).method6744(arg0);
        }
    }

    @ObfuscatedName("on.a(B)Loj;")
    public abstract class391 method6649();

    @ObfuscatedName("on.f(II)[Loj;")
    public abstract class391[] method6650(int arg0);
}
