package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fl")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fl.a")
    public InputStream field2166;

    @ObfuscatedName("fl.w")
    public OutputStream field2162;

    @ObfuscatedName("fl.e")
    public Socket field2163;

    @ObfuscatedName("fl.k")
    public boolean field2164 = false;

    @ObfuscatedName("fl.u")
    public class157 field2168;

    @ObfuscatedName("fl.z")
    public class156 field2175;

    @ObfuscatedName("fl.t")
    public byte[] field2167;

    @ObfuscatedName("fl.f")
    public int field2169 = 0;

    @ObfuscatedName("fl.g")
    public int field2173 = 0;

    @ObfuscatedName("fl.j")
    public boolean field2161 = false;

    @ObfuscatedName("fl.x")
    public final int field2165;

    @ObfuscatedName("fl.c")
    public final int field2172;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2168 = arg1;
        this.field2163 = arg0;
        this.field2165 = arg2;
        this.field2172 = arg2 - 100;
        this.field2163.setSoTimeout(30000);
        this.field2163.setTcpNoDelay(true);
        this.field2163.setReceiveBufferSize(65536);
        this.field2163.setSendBufferSize(65536);
        this.field2166 = this.field2163.getInputStream();
        this.field2162 = this.field2163.getOutputStream();
    }

    @ObfuscatedName("fl.t(B)V")
    public void method2776() {
        if (this.field2164) {
            return;
        }
        synchronized (this) {
            this.field2164 = true;
            this.notifyAll();
        }
        if (this.field2175 != null) {
            while (this.field2175.field2123 == 0) {
                class193.method1373(1L);
            }
            if (this.field2175.field2123 == 1) {
                try {
                    ((Thread) this.field2175.field2127).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2175 = null;
    }

    public void finalize() {
        this.method2776();
    }

    @ObfuscatedName("fl.k(I)I")
    public int method2786() throws IOException {
        return this.field2164 ? 0 : this.field2166.read();
    }

    @ObfuscatedName("fl.e(B)I")
    public int method2773() throws IOException {
        return this.field2164 ? 0 : this.field2166.available();
    }

    @ObfuscatedName("fl.w(II)Z")
    public boolean method2772(int arg0) throws IOException {
        if (this.field2164) {
            return false;
        }
        try {
            return this.field2166.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fl.u([BIII)I")
    public int method2782(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2166.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fl.ak([BIII)V")
    public void method2804(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return;
        }
        if (this.field2161) {
            this.field2161 = false;
            throw new IOException();
        }
        if (this.field2167 == null) {
            this.field2167 = new byte[this.field2165];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2167[this.field2173] = arg0[arg1 + var5];
                this.field2173 = (this.field2173 + 1) % this.field2165;
                if ((this.field2172 + this.field2169) % this.field2165 == this.field2173) {
                    throw new IOException();
                }
            }
            if (this.field2175 == null) {
                this.field2175 = this.field2168.method2733(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2173 == this.field2169) {
                            if (this.field2164) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2169;
                        if (this.field2173 >= this.field2169) {
                            var4 = this.field2173 - this.field2169;
                        } else {
                            var4 = this.field2165 - this.field2169;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2162.write(this.field2167, var3, var4);
                    } catch (IOException var12) {
                        this.field2161 = true;
                    }
                    this.field2169 = (this.field2169 + var4) % this.field2165;
                    try {
                        if (this.field2173 == this.field2169) {
                            this.field2162.flush();
                        }
                    } catch (IOException var11) {
                        this.field2161 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2166 != null) {
                        this.field2166.close();
                    }
                    if (this.field2162 != null) {
                        this.field2162.close();
                    }
                    if (this.field2163 != null) {
                        this.field2163.close();
                    }
                } catch (IOException var10) {
                }
                this.field2167 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method1339((String) null, var15);
        }
    }

    @ObfuscatedName("fl.z([BIII)V")
    public void method2775(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2804(arg0, arg1, arg2);
    }
}
