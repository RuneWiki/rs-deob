package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("i")
public class class19 {

    @ObfuscatedName("i.l")
    public int field263;

    @ObfuscatedName("i.g")
    public class150 field258;

    @ObfuscatedName("i.r")
    public DataInputStream field259;

    @ObfuscatedName("i.e")
    public byte[] field262 = new byte[4];

    @ObfuscatedName("i.h")
    public int field269;

    @ObfuscatedName("i.s")
    public byte[] field273;

    @ObfuscatedName("i.k")
    public int field261;

    @ObfuscatedName("i.u")
    public long field257;

    public class19(class140 arg0, URL arg1) {
        this.field258 = arg0.method2882(arg1);
        this.field263 = 0;
        this.field257 = class119.method1224() + 30000L;
    }

    @ObfuscatedName("i.l(I)[B")
    public byte[] method205() throws IOException {
        if (class119.method1224() > this.field257) {
            throw new IOException();
        }
        if (this.field263 == 0) {
            if (this.field258.field2277 == 2) {
                throw new IOException();
            }
            if (this.field258.field2277 == 1) {
                this.field259 = (DataInputStream) this.field258.field2273;
                this.field263 = 1;
            }
        }
        if (this.field263 == 1) {
            int var1 = this.field259.available();
            if (var1 > 0) {
                if (this.field269 + var1 > 4) {
                    var1 = 4 - this.field269;
                }
                this.field269 += this.field259.read(this.field262, this.field269, var1);
                if (this.field269 == 4) {
                    int var2 = (new class123(this.field262)).method2477();
                    this.field273 = new byte[var2];
                    this.field263 = 2;
                }
            }
        }
        if (this.field263 == 2) {
            int var3 = this.field259.available();
            if (var3 > 0) {
                if (this.field261 + var3 > this.field273.length) {
                    var3 = this.field273.length - this.field261;
                }
                this.field261 += this.field259.read(this.field273, this.field261, var3);
                if (this.field261 == this.field273.length) {
                    return this.field273;
                }
            }
        }
        return null;
    }
}
