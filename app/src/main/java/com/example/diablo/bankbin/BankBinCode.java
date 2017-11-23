package com.example.diablo.bankbin;

import com.example.diablo.bankbin.banks.NongYeBank;
import com.example.diablo.bankbin.banks.JiaoTongBank;
import com.example.diablo.bankbin.banks.JianSheBank;
import com.example.diablo.bankbin.banks.ZhaoShangBank;
import com.example.diablo.bankbin.banks.ChinaBank;
import com.example.diablo.bankbin.banks.GongshangBank;
import com.example.diablo.bankbin.banks.PinAnBank;
import com.example.diablo.bankbin.banks.PuFaBank;
import com.example.diablo.bankbin.banks.XingYeBank;

/**
 * Created by Diablo on 2017/11/20.
 */

public class BankBinCode {

    public static String getBank(String bankNum) {
        for (String cmbCode : NongYeBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return NongYeBank.NAME;
            }
        }

        for (String cmbCode : JiaoTongBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return JiaoTongBank.NAME;
            }
        }

        for (String cmbCode : JianSheBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return JianSheBank.NAME;
            }
        }

        for (String cmbCode : ChinaBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return ChinaBank.NAME;
            }
        }

        for (String cmbCode : ZhaoShangBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return ZhaoShangBank.NAME;
            }
        }

        for (String cmbCode : GongshangBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return GongshangBank.NAME;
            }
        }

        for (String cmbCode : PinAnBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return PinAnBank.NAME;
            }
        }

        for (String cmbCode : PuFaBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return PuFaBank.NAME;
            }
        }

        for (String cmbCode : XingYeBank.BIN_NUM) {
            if (bankNum.startsWith(cmbCode)) {
                return XingYeBank.NAME;
            }
        }
        return "未知银行";
    }
}
