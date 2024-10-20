package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class17 {

    @ObfuscatedName("t.a")
    public int field246;

    @ObfuscatedName("t.v")
    public class137 field243;

    @ObfuscatedName("t.i")
    public byte[] field244 = new byte[4];

    @ObfuscatedName("t.b")
    public DataInputStream field242;

    @ObfuscatedName("t.l")
    public int field245;

    @ObfuscatedName("t.m")
    public byte[] field247;

    @ObfuscatedName("t.w")
    public int field248;

    @ObfuscatedName("t.e")
    public long field249;

    public class17(class127 arg0, URL arg1) {
        this.field243 = arg0.method2483(arg1);
        this.field246 = 0;
        this.field249 = class106.method2471() + 30000L;
    }

    @ObfuscatedName("t.a(B)[B")
    public byte[] method179() throws IOException {
        if (class106.method2471() > this.field249) {
            throw new IOException();
        }
        if (this.field246 == 0) {
            if (this.field243.field2101 == 2) {
                throw new IOException();
            }
            if (this.field243.field2101 == 1) {
                this.field242 = (DataInputStream) this.field243.field2097;
                this.field246 = 1;
            }
        }
        if (this.field246 == 1) {
            int var1 = this.field242.available();
            if (var1 > 0) {
                if (this.field245 + var1 > 4) {
                    var1 = 4 - this.field245;
                }
                this.field245 += this.field242.read(this.field244, this.field245, var1);
                if (this.field245 == 4) {
                    int var2 = (new class110(this.field244)).method2136();
                    this.field247 = new byte[var2];
                    this.field246 = 2;
                }
            }
        }
        if (this.field246 == 2) {
            int var3 = this.field242.available();
            if (var3 > 0) {
                if (this.field248 + var3 > this.field247.length) {
                    var3 = this.field247.length - this.field248;
                }
                this.field248 += this.field242.read(this.field247, this.field248, var3);
                if (this.field248 == this.field247.length) {
                    return this.field247;
                }
            }
        }
        return null;
    }
}
