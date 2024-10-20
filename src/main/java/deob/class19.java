package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("v")
public class class19 {

    @ObfuscatedName("v.b")
    public int field263;

    @ObfuscatedName("v.g")
    public class147 field257;

    @ObfuscatedName("v.j")
    public DataInputStream field259;

    @ObfuscatedName("v.d")
    public byte[] field260 = new byte[4];

    @ObfuscatedName("v.x")
    public int field261;

    @ObfuscatedName("v.y")
    public byte[] field262;

    @ObfuscatedName("v.r")
    public int field272;

    @ObfuscatedName("v.c")
    public long field264;

    public class19(class137 arg0, URL arg1) {
        this.field257 = arg0.method2749(arg1);
        this.field263 = 0;
        this.field264 = class116.method1946() + 30000L;
    }

    @ObfuscatedName("v.b(I)[B")
    public byte[] method180() throws IOException {
        if (class116.method1946() > this.field264) {
            throw new IOException();
        }
        if (this.field263 == 0) {
            if (this.field257.field2200 == 2) {
                throw new IOException();
            }
            if (this.field257.field2200 == 1) {
                this.field259 = (DataInputStream) this.field257.field2202;
                this.field263 = 1;
            }
        }
        if (this.field263 == 1) {
            int var1 = this.field259.available();
            if (var1 > 0) {
                if (this.field261 + var1 > 4) {
                    var1 = 4 - this.field261;
                }
                this.field261 += this.field259.read(this.field260, this.field261, var1);
                if (this.field261 == 4) {
                    int var2 = (new class120(this.field260)).method2349();
                    this.field262 = new byte[var2];
                    this.field263 = 2;
                }
            }
        }
        if (this.field263 == 2) {
            int var3 = this.field259.available();
            if (var3 > 0) {
                if (this.field272 + var3 > this.field262.length) {
                    var3 = this.field262.length - this.field272;
                }
                this.field272 += this.field259.read(this.field262, this.field272, var3);
                if (this.field272 == this.field262.length) {
                    return this.field262;
                }
            }
        }
        return null;
    }
}
