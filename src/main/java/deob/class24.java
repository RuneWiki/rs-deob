package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class24 {

    @ObfuscatedName("d.g")
    public int field388;

    @ObfuscatedName("d.h")
    public class79 field384;

    @ObfuscatedName("d.s")
    public DataInputStream field385;

    @ObfuscatedName("d.o")
    public byte[] field383 = new byte[4];

    @ObfuscatedName("d.p")
    public int field387;

    @ObfuscatedName("d.x")
    public byte[] field393;

    @ObfuscatedName("d.k")
    public int field390;

    @ObfuscatedName("d.r")
    public long field386;

    public class24(class74 arg0, URL arg1) {
        this.field384 = arg0.method1510(arg1);
        this.field388 = 0;
        this.field386 = class121.method226() + 30000L;
    }

    @ObfuscatedName("d.g(I)[B")
    public byte[] method227() throws IOException {
        if (class121.method226() > this.field386) {
            throw new IOException();
        }
        if (this.field388 == 0) {
            if (this.field384.field1392 == 2) {
                throw new IOException();
            }
            if (this.field384.field1392 == 1) {
                this.field385 = (DataInputStream) this.field384.field1397;
                this.field388 = 1;
            }
        }
        if (this.field388 == 1) {
            int var1 = this.field385.available();
            if (var1 > 0) {
                if (this.field387 + var1 > 4) {
                    var1 = 4 - this.field387;
                }
                this.field387 += this.field385.read(this.field383, this.field387, var1);
                if (this.field387 == 4) {
                    int var2 = (new class127(this.field383)).method2548();
                    this.field393 = new byte[var2];
                    this.field388 = 2;
                }
            }
        }
        if (this.field388 == 2) {
            int var3 = this.field385.available();
            if (var3 > 0) {
                if (this.field390 + var3 > this.field393.length) {
                    var3 = this.field393.length - this.field390;
                }
                this.field390 += this.field385.read(this.field393, this.field390, var3);
                if (this.field390 == this.field393.length) {
                    return this.field393;
                }
            }
        }
        return null;
    }
}
