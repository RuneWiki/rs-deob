package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("y")
public class class18 {

    @ObfuscatedName("y.e")
    public int field230;

    @ObfuscatedName("y.a")
    public class138 field235;

    @ObfuscatedName("y.l")
    public DataInputStream field232;

    @ObfuscatedName("y.c")
    public byte[] field233 = new byte[4];

    @ObfuscatedName("y.u")
    public int field234;

    @ObfuscatedName("y.w")
    public byte[] field238;

    @ObfuscatedName("y.i")
    public int field236;

    @ObfuscatedName("y.r")
    public long field231;

    public class18(class128 arg0, URL arg1) {
        this.field235 = arg0.method2568(arg1);
        this.field230 = 0;
        this.field231 = class107.method635() + 30000L;
    }

    @ObfuscatedName("y.e(I)[B")
    public byte[] method207() throws IOException {
        if (class107.method635() > this.field231) {
            throw new IOException();
        }
        if (this.field230 == 0) {
            if (this.field235.field2070 == 2) {
                throw new IOException();
            }
            if (this.field235.field2070 == 1) {
                this.field232 = (DataInputStream) this.field235.field2074;
                this.field230 = 1;
            }
        }
        if (this.field230 == 1) {
            int var1 = this.field232.available();
            if (var1 > 0) {
                if (this.field234 + var1 > 4) {
                    var1 = 4 - this.field234;
                }
                this.field234 += this.field232.read(this.field233, this.field234, var1);
                if (this.field234 == 4) {
                    int var2 = (new class111(this.field233)).method2378();
                    this.field238 = new byte[var2];
                    this.field230 = 2;
                }
            }
        }
        if (this.field230 == 2) {
            int var3 = this.field232.available();
            if (var3 > 0) {
                if (this.field236 + var3 > this.field238.length) {
                    var3 = this.field238.length - this.field236;
                }
                this.field236 += this.field232.read(this.field238, this.field236, var3);
                if (this.field236 == this.field238.length) {
                    return this.field238;
                }
            }
        }
        return null;
    }
}
