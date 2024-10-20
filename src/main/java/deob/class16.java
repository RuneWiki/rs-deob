package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("v")
public class class16 {

    @ObfuscatedName("v.m")
    public int field244;

    @ObfuscatedName("v.k")
    public class130 field236;

    @ObfuscatedName("v.y")
    public DataInputStream field235;

    @ObfuscatedName("v.g")
    public byte[] field238 = new byte[4];

    @ObfuscatedName("v.r")
    public int field239;

    @ObfuscatedName("v.i")
    public byte[] field242;

    @ObfuscatedName("v.f")
    public int field241;

    @ObfuscatedName("v.a")
    public long field240;

    public class16(class120 arg0, URL arg1) {
        this.field236 = arg0.method2472(arg1);
        this.field244 = 0;
        this.field240 = class100.method100() + 30000L;
    }

    @ObfuscatedName("v.m(S)[B")
    public byte[] method155() throws IOException {
        if (class100.method100() > this.field240) {
            throw new IOException();
        }
        if (this.field244 == 0) {
            if (this.field236.field2037 == 2) {
                throw new IOException();
            }
            if (this.field236.field2037 == 1) {
                this.field235 = (DataInputStream) this.field236.field2041;
                this.field244 = 1;
            }
        }
        if (this.field244 == 1) {
            int var1 = this.field235.available();
            if (var1 > 0) {
                if (this.field239 + var1 > 4) {
                    var1 = 4 - this.field239;
                }
                this.field239 += this.field235.read(this.field238, this.field239, var1);
                if (this.field239 == 4) {
                    int var2 = (new class104(this.field238)).method2135();
                    this.field242 = new byte[var2];
                    this.field244 = 2;
                }
            }
        }
        if (this.field244 == 2) {
            int var3 = this.field235.available();
            if (var3 > 0) {
                if (this.field241 + var3 > this.field242.length) {
                    var3 = this.field242.length - this.field241;
                }
                this.field241 += this.field235.read(this.field242, this.field241, var3);
                if (this.field241 == this.field242.length) {
                    return this.field242;
                }
            }
        }
        return null;
    }
}
