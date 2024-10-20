package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("q")
public class class92 {

    @ObfuscatedName("q.g")
    public long field1068;

    @ObfuscatedName("q.n")
    public int field1069;

    @ObfuscatedName("q.o")
    public DataInputStream field1063;

    @ObfuscatedName("q.j")
    public int field1073;

    @ObfuscatedName("q.h")
    public int field1065;

    @ObfuscatedName("q.t")
    public byte[] field1061 = new byte[4];

    @ObfuscatedName("q.r")
    public byte[] field1066;

    @ObfuscatedName("q.p")
    public class107 field1062;

    @ObfuscatedName("q.j(I)[B")
    public byte[] method1334() throws IOException {
        if (Statics.method1882() > this.field1068) {
            throw new IOException();
        }
        if (this.field1073 == 0) {
            if (this.field1062.field1467 == 2) {
                throw new IOException();
            }
            if (this.field1062.field1467 == 1) {
                this.field1063 = (DataInputStream) this.field1062.field1471;
                this.field1073 = 1;
            }
        }
        if (this.field1073 == 1) {
            int var1 = this.field1063.available();
            if (var1 > 0) {
                if (this.field1065 + var1 > 4) {
                    var1 = 4 - this.field1065;
                }
                this.field1065 += this.field1063.read(this.field1061, this.field1065, var1);
                if (this.field1065 == 4) {
                    int var2 = (new class31(this.field1061)).method376();
                    this.field1066 = new byte[var2];
                    this.field1073 = 2;
                }
            }
        }
        if (this.field1073 == 2) {
            int var3 = this.field1063.available();
            if (var3 > 0) {
                if (this.field1069 + var3 > this.field1066.length) {
                    var3 = this.field1066.length - this.field1069;
                }
                this.field1069 += this.field1063.read(this.field1066, this.field1069, var3);
                if (this.field1069 == this.field1066.length) {
                    return this.field1066;
                }
            }
        }
        return null;
    }

    public class92(class110 arg0, URL arg1) {
        this.field1062 = arg0.method1915(arg1);
        this.field1073 = 0;
        this.field1068 = Statics.method1882() + 30000L;
    }
}
