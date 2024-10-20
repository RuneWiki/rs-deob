package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ng")
public class class371 extends AbstractQueue {

    @ObfuscatedName("ng.f")
    public class369[] field4388;

    @ObfuscatedName("ng.w")
    public Map field4385;

    @ObfuscatedName("ng.v")
    public int field4386;

    @ObfuscatedName("ng.s")
    public final Comparator field4384;

    @ObfuscatedName("ng.z")
    public int field4387;

    public class371(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class371(int arg0, Comparator arg1) {
        this.field4387 = 0;
        this.field4388 = new class369[arg0];
        this.field4385 = new HashMap();
        this.field4384 = arg1;
    }

    @ObfuscatedName("ng.f(I)V")
    public void method6473() {
        int var1 = (this.field4388.length << 1) + 1;
        this.field4388 = (class369[]) ((class369[]) Arrays.copyOf(this.field4388, var1));
    }

    public int size() {
        return this.field4386;
    }

    public boolean offer(Object arg0) {
        if (this.field4385.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4387++;
        int var2 = this.field4386;
        if (var2 >= this.field4388.length) {
            this.method6473();
        }
        this.field4386++;
        if (var2 == 0) {
            this.field4388[0] = new class369(arg0, 0);
            this.field4385.put(arg0, this.field4388[0]);
        } else {
            this.field4388[var2] = new class369(arg0, var2);
            this.field4385.put(arg0, this.field4388[var2]);
            this.method6478(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4386 == 0 ? null : this.field4388[0].field4378;
    }

    public Object poll() {
        if (this.field4386 == 0) {
            return null;
        }
        this.field4387++;
        Object var1 = this.field4388[0].field4378;
        this.field4385.remove(var1);
        this.field4386--;
        if (this.field4386 == 0) {
            this.field4388[this.field4386] = null;
        } else {
            this.field4388[0] = this.field4388[this.field4386];
            this.field4388[0].field4377 = 0;
            this.field4388[this.field4386] = null;
            this.method6475(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class369 var2 = (class369) this.field4385.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4387++;
        this.field4386--;
        if (this.field4386 == var2.field4377) {
            this.field4388[this.field4386] = null;
            return true;
        }
        class369 var3 = this.field4388[this.field4386];
        this.field4388[this.field4386] = null;
        this.field4388[var2.field4377] = var3;
        this.field4388[var2.field4377].field4377 = var2.field4377;
        this.method6475(var2.field4377);
        if (this.field4388[var2.field4377] == var3) {
            this.method6478(var2.field4377);
        }
        return true;
    }

    @ObfuscatedName("ng.w(IB)V")
    public void method6478(int arg0) {
        class369 var2 = this.field4388[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class369 var4 = this.field4388[var3];
            if (this.field4384 == null) {
                if (((Comparable) var2.field4378).compareTo(var4.field4378) >= 0) {
                    break;
                }
            } else if (this.field4384.compare(var2.field4378, var4.field4378) >= 0) {
                break;
            }
            this.field4388[arg0] = var4;
            this.field4388[arg0].field4377 = arg0;
            arg0 = var3;
        }
        this.field4388[arg0] = var2;
        this.field4388[arg0].field4377 = arg0;
    }

    @ObfuscatedName("ng.v(IB)V")
    public void method6475(int arg0) {
        class369 var2 = this.field4388[arg0];
        int var3 = this.field4386 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class369 var5 = this.field4388[var4];
            int var6 = (arg0 << 1) + 2;
            class369 var7 = this.field4388[var6];
            int var8;
            if (this.field4384 == null) {
                if (var6 < this.field4386 && ((Comparable) var5.field4378).compareTo(var7.field4378) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4386 && this.field4384.compare(var5.field4378, var7.field4378) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4384 == null) {
                if (((Comparable) var2.field4378).compareTo(this.field4388[var8].field4378) <= 0) {
                    break;
                }
            } else if (this.field4384.compare(var2.field4378, this.field4388[var8].field4378) <= 0) {
                break;
            }
            this.field4388[arg0] = this.field4388[var8];
            this.field4388[arg0].field4377 = arg0;
            arg0 = var8;
        }
        this.field4388[arg0] = var2;
        this.field4388[arg0].field4377 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4385.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4384 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4384);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class370(this);
    }
}
