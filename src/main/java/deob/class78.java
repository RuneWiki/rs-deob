package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bi")
public class class78 {

    @ObfuscatedName("bi.e")
    public int field1221;

    @ObfuscatedName("bi.o")
    public class154 field1218;

    @ObfuscatedName("bi.m")
    public DataInputStream field1219;

    @ObfuscatedName("bi.g")
    public byte[] field1220 = new byte[4];

    @ObfuscatedName("bi.d")
    public int field1223;

    @ObfuscatedName("bi.b")
    public byte[] field1222;

    @ObfuscatedName("bi.k")
    public int field1217;

    @ObfuscatedName("bi.f")
    public long field1224;

    public class78(class155 arg0, URL arg1) {
        this.field1218 = arg0.method2702(arg1);
        this.field1221 = 0;
        this.field1224 = class176.method218() + 30000L;
    }

    @ObfuscatedName("bi.e(I)[B")
    public byte[] method1377() throws IOException {
        if (class176.method218() > this.field1224) {
            throw new IOException();
        }
        if (this.field1221 == 0) {
            if (this.field1218.field2213 == 2) {
                throw new IOException();
            }
            if (this.field1218.field2213 == 1) {
                this.field1219 = (DataInputStream) this.field1218.field2214;
                this.field1221 = 1;
            }
        }
        if (this.field1221 == 1) {
            this.field1223 += this.field1219.read(this.field1220, this.field1223, this.field1220.length - this.field1223);
            if (this.field1223 == 4) {
                int var1 = (new class174(this.field1220)).method2896();
                this.field1222 = new byte[var1];
                this.field1221 = 2;
            }
        }
        if (this.field1221 == 2) {
            this.field1217 += this.field1219.read(this.field1222, this.field1217, this.field1222.length - this.field1217);
            if (this.field1217 == this.field1222.length) {
                return this.field1222;
            }
        }
        return null;
    }
}
