package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("od")
public abstract class class396 {

    @ObfuscatedName("od.u")
    public final int field4538;

    @ObfuscatedName("od.b")
    public int field4535 = 0;

    @ObfuscatedName("od.j")
    public class394[] field4537;

    @ObfuscatedName("od.g")
    public HashMap field4539;

    @ObfuscatedName("od.i")
    public HashMap field4536;

    @ObfuscatedName("od.o")
    public Comparator field4534 = null;

    public class396(int arg0) {
        this.field4538 = arg0;
        this.field4537 = this.method6765(arg0);
        this.field4539 = new HashMap(arg0 / 8);
        this.field4536 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("od.ar(S)V")
    public void method6864() {
        this.field4535 = 0;
        Arrays.fill(this.field4537, (Object) null);
        this.field4539.clear();
        this.field4536.clear();
    }

    @ObfuscatedName("od.at(I)I")
    public int method6865() {
        return this.field4535;
    }

    @ObfuscatedName("od.ay(I)Z")
    public boolean method6866() {
        return this.field4538 == this.field4535;
    }

    @ObfuscatedName("od.an(Lrp;B)Z")
    public boolean method6867(class490 arg0) {
        if (arg0.method8385()) {
            return this.field4539.containsKey(arg0) ? true : this.field4536.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("od.ab(Lrp;B)Lov;")
    public class394 method6886(class490 arg0) {
        class394 var2 = this.method6883(arg0);
        return var2 == null ? this.method6870(arg0) : var2;
    }

    @ObfuscatedName("od.al(Lrp;B)Lov;")
    public class394 method6883(class490 arg0) {
        return arg0.method8385() ? (class394) this.field4539.get(arg0) : null;
    }

    @ObfuscatedName("od.ag(Lrp;I)Lov;")
    public class394 method6870(class490 arg0) {
        return arg0.method8385() ? (class394) this.field4536.get(arg0) : null;
    }

    @ObfuscatedName("od.az(Lrp;B)Z")
    public final boolean method6918(class490 arg0) {
        class394 var2 = this.method6883(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6872(var2);
            return true;
        }
    }

    @ObfuscatedName("od.ak(Lov;I)V")
    public final void method6872(class394 arg0) {
        int var2 = this.method6877(arg0);
        if (var2 != -1) {
            this.method6881(var2);
            this.method6878(arg0);
        }
    }

    @ObfuscatedName("od.af(Lrp;B)Lov;")
    public class394 method6873(class490 arg0) {
        return this.method6874(arg0, (class490) null);
    }

    @ObfuscatedName("od.ai(Lrp;Lrp;B)Lov;")
    public class394 method6874(class490 arg0, class490 arg1) {
        if (this.method6883(arg0) != null) {
            throw new IllegalStateException();
        }
        class394 var3 = this.method6769();
        var3.method6843(arg0, arg1);
        this.method6879(var3);
        this.method6880(var3);
        return var3;
    }

    @ObfuscatedName("od.ax(II)Lov;")
    public final class394 method6875(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4535) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4537[arg0];
    }

    @ObfuscatedName("od.ah(I)V")
    public final void method6917() {
        if (this.field4534 == null) {
            Arrays.sort(this.field4537, 0, this.field4535);
        } else {
            Arrays.sort(this.field4537, 0, this.field4535, this.field4534);
        }
    }

    @ObfuscatedName("od.aw(Lov;Lrp;Lrp;I)V")
    public final void method6876(class394 arg0, class490 arg1, class490 arg2) {
        this.method6878(arg0);
        arg0.method6843(arg1, arg2);
        this.method6880(arg0);
    }

    @ObfuscatedName("od.aj(Lov;I)I")
    public final int method6877(class394 arg0) {
        for (int var2 = 0; var2 < this.field4535; var2++) {
            if (this.field4537[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("od.aq(Lov;B)V")
    public final void method6878(class394 arg0) {
        if (this.field4539.remove(arg0.field4528) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4529 != null) {
            this.field4536.remove(arg0.field4529);
        }
    }

    @ObfuscatedName("od.ap(Lov;I)V")
    public final void method6879(class394 arg0) {
        this.field4537[++this.field4535 - 1] = arg0;
    }

    @ObfuscatedName("od.aa(Lov;I)V")
    public final void method6880(class394 arg0) {
        this.field4539.put(arg0.field4528, arg0);
        if (arg0.field4529 != null) {
            class394 var2 = (class394) this.field4536.put(arg0.field4529, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4529 = null;
            }
        }
    }

    @ObfuscatedName("od.ae(IB)V")
    public final void method6881(int arg0) {
        this.field4535--;
        if (arg0 < this.field4535) {
            System.arraycopy(this.field4537, arg0 + 1, this.field4537, arg0, this.field4535 - arg0);
        }
    }

    @ObfuscatedName("od.ac(I)V")
    public final void method6868() {
        this.field4534 = null;
    }

    @ObfuscatedName("od.bh(Ljava/util/Comparator;I)V")
    public final void method6919(Comparator arg0) {
        if (this.field4534 == null) {
            this.field4534 = arg0;
        } else if (this.field4534 instanceof class395) {
            ((class395) this.field4534).method6860(arg0);
        }
    }

    @ObfuscatedName("od.h(B)Lov;")
    public abstract class394 method6769();

    @ObfuscatedName("od.e(II)[Lov;")
    public abstract class394[] method6765(int arg0);
}
