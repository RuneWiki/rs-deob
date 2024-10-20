package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ea")
public final class class144 implements Runnable {

    @ObfuscatedName("ea.j")
    public InputStream field2170;

    @ObfuscatedName("ea.h")
    public OutputStream field2162;

    @ObfuscatedName("ea.m")
    public Socket field2160;

    @ObfuscatedName("ea.z")
    public boolean field2161 = false;

    @ObfuscatedName("ea.x")
    public class137 field2164;

    @ObfuscatedName("ea.e")
    public class147 field2163;

    @ObfuscatedName("ea.i")
    public byte[] field2166;

    @ObfuscatedName("ea.c")
    public int field2165 = 0;

    @ObfuscatedName("ea.n")
    public int field2159 = 0;

    @ObfuscatedName("ea.l")
    public boolean field2168 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2164 = arg1;
        this.field2160 = arg0;
        this.field2160.setSoTimeout(30000);
        this.field2160.setTcpNoDelay(true);
        this.field2160.setReceiveBufferSize(16384);
        this.field2160.setSendBufferSize(16384);
        this.field2170 = this.field2160.getInputStream();
        this.field2162 = this.field2160.getOutputStream();
    }

    @ObfuscatedName("ea.m(B)V")
    public void method2811() {
        if (this.field2161) {
            return;
        }
        synchronized (this) {
            this.field2161 = true;
            this.notifyAll();
        }
        if (this.field2163 != null) {
            while (this.field2163.field2196 == 0) {
                class128.method167(1L);
            }
            if (this.field2163.field2196 == 1) {
                try {
                    ((Thread) this.field2163.field2195).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2163 = null;
    }

    public void finalize() {
        this.method2811();
    }

    @ObfuscatedName("ea.z(B)I")
    public int method2815() throws IOException {
        return this.field2161 ? 0 : this.field2170.read();
    }

    @ObfuscatedName("ea.x(I)I")
    public int method2819() throws IOException {
        return this.field2161 ? 0 : this.field2170.available();
    }

    @ObfuscatedName("ea.e([BIII)V")
    public void method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2161) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2170.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ea.i([BIII)V")
    public void method2814(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2161) {
            return;
        }
        if (this.field2168) {
            this.field2168 = false;
            throw new IOException();
        }
        if (this.field2166 == null) {
            this.field2166 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2166[this.field2159] = arg0[arg1 + var5];
                this.field2159 = (this.field2159 + 1) % 5000;
                if ((this.field2165 + 4900) % 5000 == this.field2159) {
                    throw new IOException();
                }
            }
            if (this.field2163 == null) {
                this.field2163 = this.field2164.method2706(this, 3);
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
                        if (this.field2165 == this.field2159) {
                            if (this.field2161) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2165;
                        if (this.field2159 >= this.field2165) {
                            var4 = this.field2159 - this.field2165;
                        } else {
                            var4 = 5000 - this.field2165;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2162.write(this.field2166, var3, var4);
                    } catch (IOException var12) {
                        this.field2168 = true;
                    }
                    this.field2165 = (this.field2165 + var4) % 5000;
                    try {
                        if (this.field2165 == this.field2159) {
                            this.field2162.flush();
                        }
                    } catch (IOException var11) {
                        this.field2168 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2170 != null) {
                        this.field2170.close();
                    }
                    if (this.field2162 != null) {
                        this.field2162.close();
                    }
                    if (this.field2160 != null) {
                        this.field2160.close();
                    }
                } catch (IOException var10) {
                }
                this.field2166 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method101((String) null, var15);
        }
    }
}
