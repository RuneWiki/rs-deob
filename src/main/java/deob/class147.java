package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("er")
public final class class147 implements Runnable {

    @ObfuscatedName("er.m")
    public InputStream field2243;

    @ObfuscatedName("er.w")
    public OutputStream field2242;

    @ObfuscatedName("er.e")
    public Socket field2246;

    @ObfuscatedName("er.o")
    public boolean field2244 = false;

    @ObfuscatedName("er.g")
    public class140 field2245;

    @ObfuscatedName("er.l")
    public class150 field2247;

    @ObfuscatedName("er.j")
    public byte[] field2249;

    @ObfuscatedName("er.r")
    public int field2248 = 0;

    @ObfuscatedName("er.x")
    public int field2241 = 0;

    @ObfuscatedName("er.k")
    public boolean field2250 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2245 = arg1;
        this.field2246 = arg0;
        this.field2246.setSoTimeout(30000);
        this.field2246.setTcpNoDelay(true);
        this.field2246.setReceiveBufferSize(16384);
        this.field2246.setSendBufferSize(16384);
        this.field2243 = this.field2246.getInputStream();
        this.field2242 = this.field2246.getOutputStream();
    }

    @ObfuscatedName("er.o(B)V")
    public void method2879() {
        if (this.field2244) {
            return;
        }
        synchronized (this) {
            this.field2244 = true;
            this.notifyAll();
        }
        if (this.field2247 != null) {
            while (this.field2247.field2279 == 0) {
                class131.method2828(1L);
            }
            if (this.field2247.field2279 == 1) {
                try {
                    ((Thread) this.field2247.field2283).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2247 = null;
    }

    public void finalize() {
        this.method2879();
    }

    @ObfuscatedName("er.g(I)I")
    public int method2871() throws IOException {
        return this.field2244 ? 0 : this.field2243.read();
    }

    @ObfuscatedName("er.l(S)I")
    public int method2873() throws IOException {
        return this.field2244 ? 0 : this.field2243.available();
    }

    @ObfuscatedName("er.j([BIIB)V")
    public void method2890(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2244) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2243.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("er.r([BIII)V")
    public void method2874(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2244) {
            return;
        }
        if (this.field2250) {
            this.field2250 = false;
            throw new IOException();
        }
        if (this.field2249 == null) {
            this.field2249 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2249[this.field2241] = arg0[arg1 + var5];
                this.field2241 = (this.field2241 + 1) % 5000;
                if ((this.field2248 + 4900) % 5000 == this.field2241) {
                    throw new IOException();
                }
            }
            if (this.field2247 == null) {
                this.field2247 = this.field2245.method2772(this, 3);
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
                        if (this.field2248 == this.field2241) {
                            if (this.field2244) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2248;
                        if (this.field2241 >= this.field2248) {
                            var4 = this.field2241 - this.field2248;
                        } else {
                            var4 = 5000 - this.field2248;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2242.write(this.field2249, var3, var4);
                    } catch (IOException var12) {
                        this.field2250 = true;
                    }
                    this.field2248 = (this.field2248 + var4) % 5000;
                    try {
                        if (this.field2248 == this.field2241) {
                            this.field2242.flush();
                        }
                    } catch (IOException var11) {
                        this.field2250 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2243 != null) {
                        this.field2243.close();
                    }
                    if (this.field2242 != null) {
                        this.field2242.close();
                    }
                    if (this.field2246 != null) {
                        this.field2246.close();
                    }
                } catch (IOException var10) {
                }
                this.field2249 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method1096((String) null, var15);
        }
    }
}
