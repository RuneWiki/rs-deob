package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ba")
public class class78 {

    @ObfuscatedName("ba.n")
    public int field1218;

    @ObfuscatedName("ba.p")
    public class154 field1221;

    @ObfuscatedName("ba.i")
    public byte[] field1220 = new byte[4];

    @ObfuscatedName("ba.j")
    public DataInputStream field1217;

    @ObfuscatedName("ba.f")
    public int field1226;

    @ObfuscatedName("ba.m")
    public byte[] field1222;

    @ObfuscatedName("ba.c")
    public int field1223;

    @ObfuscatedName("ba.z")
    public long field1224;

    public class78(class155 arg0, URL arg1) {
        this.field1221 = arg0.method2724(arg1);
        this.field1218 = 0;
        this.field1224 = class176.method2396() + 30000L;
    }

    @ObfuscatedName("ba.n(B)[B")
    public byte[] method1379() throws IOException {
        if (class176.method2396() > this.field1224) {
            throw new IOException();
        }
        if (this.field1218 == 0) {
            if (this.field1221.field2237 == 2) {
                throw new IOException();
            }
            if (this.field1221.field2237 == 1) {
                this.field1217 = (DataInputStream) this.field1221.field2241;
                this.field1218 = 1;
            }
        }
        if (this.field1218 == 1) {
            this.field1226 += this.field1217.read(this.field1220, this.field1226, this.field1220.length - this.field1226);
            if (this.field1226 == 4) {
                int var1 = (new class174(this.field1220)).method3058();
                this.field1222 = new byte[var1];
                this.field1218 = 2;
            }
        }
        if (this.field1218 == 2) {
            this.field1223 += this.field1217.read(this.field1222, this.field1223, this.field1222.length - this.field1223);
            if (this.field1223 == this.field1222.length) {
                return this.field1222;
            }
        }
        return null;
    }
}
