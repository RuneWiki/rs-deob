package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class class17 {

    @ObfuscatedName("s.y")
    public int field236;

    @ObfuscatedName("s.u")
    public class133 field237;

    @ObfuscatedName("s.k")
    public DataInputStream field238;

    @ObfuscatedName("s.v")
    public byte[] field244 = new byte[4];

    @ObfuscatedName("s.l")
    public int field240;

    @ObfuscatedName("s.g")
    public byte[] field241;

    @ObfuscatedName("s.a")
    public int field249;

    @ObfuscatedName("s.x")
    public long field239;

    public class17(class123 arg0, URL arg1) {
        this.field237 = arg0.method2462(arg1);
        this.field236 = 0;
        this.field239 = class103.method790() + 30000L;
    }

    @ObfuscatedName("s.y(B)[B")
    public byte[] method150() throws IOException {
        if (class103.method790() > this.field239) {
            throw new IOException();
        }
        if (this.field236 == 0) {
            if (this.field237.field2070 == 2) {
                throw new IOException();
            }
            if (this.field237.field2070 == 1) {
                this.field238 = (DataInputStream) this.field237.field2066;
                this.field236 = 1;
            }
        }
        if (this.field236 == 1) {
            int var1 = this.field238.available();
            if (var1 > 0) {
                if (this.field240 + var1 > 4) {
                    var1 = 4 - this.field240;
                }
                this.field240 += this.field238.read(this.field244, this.field240, var1);
                if (this.field240 == 4) {
                    int var2 = (new class107(this.field244)).method2114();
                    this.field241 = new byte[var2];
                    this.field236 = 2;
                }
            }
        }
        if (this.field236 == 2) {
            int var3 = this.field238.available();
            if (var3 > 0) {
                if (this.field249 + var3 > this.field241.length) {
                    var3 = this.field241.length - this.field249;
                }
                this.field249 += this.field238.read(this.field241, this.field249, var3);
                if (this.field249 == this.field241.length) {
                    return this.field241;
                }
            }
        }
        return null;
    }
}
