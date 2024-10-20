package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qg")
public class class434 extends AbstractQueue {

    @ObfuscatedName("qg.ac")
    public class432[] field4771;

    @ObfuscatedName("qg.ae")
    public Map field4765;

    @ObfuscatedName("qg.ag")
    public int field4768;

    @ObfuscatedName("qg.am")
    public final Comparator field4766;

    @ObfuscatedName("qg.ax")
    public int field4769;

    public class434(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class434(int arg0, Comparator arg1) {
        this.field4769 = 0;
        this.field4771 = new class432[arg0];
        this.field4765 = new HashMap();
        this.field4766 = arg1;
    }

    @ObfuscatedName("qg.ac(I)V")
    public void method7475() {
        int var1 = (this.field4771.length << 1) + 1;
        this.field4771 = (class432[]) ((class432[]) Arrays.copyOf(this.field4771, var1));
    }

    public int size() {
        return this.field4768;
    }

    public boolean offer(Object arg0) {
        if (this.field4765.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4769++;
        int var2 = this.field4768;
        if (var2 >= this.field4771.length) {
            this.method7475();
        }
        this.field4768++;
        if (var2 == 0) {
            this.field4771[0] = new class432(arg0, 0);
            this.field4765.put(arg0, this.field4771[0]);
        } else {
            this.field4771[var2] = new class432(arg0, var2);
            this.field4765.put(arg0, this.field4771[var2]);
            this.method7490(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4768 == 0 ? null : this.field4771[0].field4759;
    }

    public Object poll() {
        if (this.field4768 == 0) {
            return null;
        }
        this.field4769++;
        Object var1 = this.field4771[0].field4759;
        this.field4765.remove(var1);
        this.field4768--;
        if (this.field4768 == 0) {
            this.field4771[this.field4768] = null;
        } else {
            this.field4771[0] = this.field4771[this.field4768];
            this.field4771[0].field4760 = 0;
            this.field4771[this.field4768] = null;
            this.method7480(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class432 var2 = (class432) this.field4765.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4769++;
        this.field4768--;
        if (this.field4768 == var2.field4760) {
            this.field4771[this.field4768] = null;
            return true;
        }
        class432 var3 = this.field4771[this.field4768];
        this.field4771[this.field4768] = null;
        this.field4771[var2.field4760] = var3;
        this.field4771[var2.field4760].field4760 = var2.field4760;
        this.method7480(var2.field4760);
        if (this.field4771[var2.field4760] == var3) {
            this.method7490(var2.field4760);
        }
        return true;
    }

    @ObfuscatedName("qg.ae(II)V")
    public void method7490(int arg0) {
        class432 var2 = this.field4771[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class432 var4 = this.field4771[var3];
            if (this.field4766 == null) {
                if (((Comparable) var2.field4759).compareTo(var4.field4759) >= 0) {
                    break;
                }
            } else if (this.field4766.compare(var2.field4759, var4.field4759) >= 0) {
                break;
            }
            this.field4771[arg0] = var4;
            this.field4771[arg0].field4760 = arg0;
            arg0 = var3;
        }
        this.field4771[arg0] = var2;
        this.field4771[arg0].field4760 = arg0;
    }

    @ObfuscatedName("qg.ag(II)V")
    public void method7480(int arg0) {
        class432 var2 = this.field4771[arg0];
        int var3 = this.field4768 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class432 var5 = this.field4771[var4];
            int var6 = (arg0 << 1) + 2;
            class432 var7 = this.field4771[var6];
            int var8;
            if (this.field4766 == null) {
                if (var6 < this.field4768 && ((Comparable) var5.field4759).compareTo(var7.field4759) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4768 && this.field4766.compare(var5.field4759, var7.field4759) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4766 == null) {
                if (((Comparable) var2.field4759).compareTo(this.field4771[var8].field4759) <= 0) {
                    break;
                }
            } else if (this.field4766.compare(var2.field4759, this.field4771[var8].field4759) <= 0) {
                break;
            }
            this.field4771[arg0] = this.field4771[var8];
            this.field4771[arg0].field4760 = arg0;
            arg0 = var8;
        }
        this.field4771[arg0] = var2;
        this.field4771[arg0].field4760 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4765.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4766 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4766);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class433(this);
    }
}
