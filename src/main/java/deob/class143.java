package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ed")
public final class class143 implements Runnable {

    @ObfuscatedName("ed.i")
    public OutputStream field2168;

    @ObfuscatedName("ed.v")
    public InputStream field2162;

    @ObfuscatedName("ed.r")
    public Socket field2163;

    @ObfuscatedName("ed.n")
    public boolean field2164 = false;

    @ObfuscatedName("ed.x")
    public class136 field2165;

    @ObfuscatedName("ed.q")
    public class146 field2166;

    @ObfuscatedName("ed.h")
    public byte[] field2167;

    @ObfuscatedName("ed.d")
    public int field2161 = 0;

    @ObfuscatedName("ed.c")
    public int field2169 = 0;

    @ObfuscatedName("ed.y")
    public boolean field2170 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2165 = arg1;
        this.field2163 = arg0;
        this.field2163.setSoTimeout(30000);
        this.field2163.setTcpNoDelay(true);
        this.field2163.setReceiveBufferSize(16384);
        this.field2163.setSendBufferSize(16384);
        this.field2162 = this.field2163.getInputStream();
        this.field2168 = this.field2163.getOutputStream();
    }

    @ObfuscatedName("ed.x(B)V")
    public void method2797() {
        if (this.field2164) {
            return;
        }
        synchronized (this) {
            this.field2164 = true;
            this.notifyAll();
        }
        if (this.field2166 != null) {
            while (this.field2166.field2194 == 0) {
                class127.method731(1L);
            }
            if (this.field2166.field2194 == 1) {
                try {
                    ((Thread) this.field2166.field2197).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2166 = null;
    }

    public void finalize() {
        this.method2797();
    }

    @ObfuscatedName("ed.q(I)I")
    public int method2799() throws IOException {
        return this.field2164 ? 0 : this.field2162.read();
    }

    @ObfuscatedName("ed.h(I)I")
    public int method2805() throws IOException {
        return this.field2164 ? 0 : this.field2162.available();
    }

    @ObfuscatedName("ed.d([BIII)V")
    public void method2801(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2162.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ed.c([BIII)V")
    public void method2802(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return;
        }
        if (this.field2170) {
            this.field2170 = false;
            throw new IOException();
        }
        if (this.field2167 == null) {
            this.field2167 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2167[this.field2169] = arg0[arg1 + var5];
                this.field2169 = (this.field2169 + 1) % 5000;
                if ((this.field2161 + 4900) % 5000 == this.field2169) {
                    throw new IOException();
                }
            }
            if (this.field2166 == null) {
                this.field2166 = this.field2165.method2697(this, 3);
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
                        if (this.field2169 == this.field2161) {
                            if (this.field2164) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2161;
                        if (this.field2169 >= this.field2161) {
                            var4 = this.field2169 - this.field2161;
                        } else {
                            var4 = 5000 - this.field2161;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2168.write(this.field2167, var3, var4);
                    } catch (IOException var12) {
                        this.field2170 = true;
                    }
                    this.field2161 = (this.field2161 + var4) % 5000;
                    try {
                        if (this.field2169 == this.field2161) {
                            this.field2168.flush();
                        }
                    } catch (IOException var11) {
                        this.field2170 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2162 != null) {
                        this.field2162.close();
                    }
                    if (this.field2168 != null) {
                        this.field2168.close();
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
            class148.method145((String) null, var15);
        }
    }
}
