package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class17 {

    @ObfuscatedName("z.c")
    public int field237;

    @ObfuscatedName("z.j")
    public class135 field236;

    @ObfuscatedName("z.y")
    public DataInputStream field239;

    @ObfuscatedName("z.r")
    public byte[] field238 = new byte[4];

    @ObfuscatedName("z.f")
    public int field241;

    @ObfuscatedName("z.l")
    public byte[] field240;

    @ObfuscatedName("z.b")
    public int field235;

    @ObfuscatedName("z.k")
    public long field243;

    public class17(class125 arg0, URL arg1) {
        this.field236 = arg0.method2502(arg1);
        this.field237 = 0;
        this.field243 = class104.method1388() + 30000L;
    }

    @ObfuscatedName("z.c(I)[B")
    public byte[] method139() throws IOException {
        if (class104.method1388() > this.field243) {
            throw new IOException();
        }
        if (this.field237 == 0) {
            if (this.field236.field2059 == 2) {
                throw new IOException();
            }
            if (this.field236.field2059 == 1) {
                this.field239 = (DataInputStream) this.field236.field2062;
                this.field237 = 1;
            }
        }
        if (this.field237 == 1) {
            int var1 = this.field239.available();
            if (var1 > 0) {
                if (this.field241 + var1 > 4) {
                    var1 = 4 - this.field241;
                }
                this.field241 += this.field239.read(this.field238, this.field241, var1);
                if (this.field241 == 4) {
                    int var2 = (new class108(this.field238)).method2144();
                    this.field240 = new byte[var2];
                    this.field237 = 2;
                }
            }
        }
        if (this.field237 == 2) {
            int var3 = this.field239.available();
            if (var3 > 0) {
                if (this.field235 + var3 > this.field240.length) {
                    var3 = this.field240.length - this.field235;
                }
                this.field235 += this.field239.read(this.field240, this.field235, var3);
                if (this.field235 == this.field240.length) {
                    return this.field240;
                }
            }
        }
        return null;
    }
}
