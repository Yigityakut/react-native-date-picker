package com.henninghall.date_picker;

import java.util.HashMap;

public class DayFormats {

    public static String get(String locale){
        return map.get(locale);
    }

    private static HashMap<String, String> map = new HashMap<String, String>(){{
        put("af","dd MMM");
        put("af_NA","dd MMM");
        put("af_ZA","dd MMM");
        put("agq","d MMM");
        put("agq_CM","d MMM");
        put("ak","MMM dd");
        put("ak_GH","MMM dd");
        put("am","MMM d");
        put("am_ET","MMM d");
        put("ar","، d MMM");
        put("ar_001","، d MMM");
        put("ar_AE","، d MMM");
        put("ar_BH","، d MMM");
        put("ar_DJ","، d MMM");
        put("ar_DZ","، d MMM");
        put("ar_EG","، d MMM");
        put("ar_EH","، d MMM");
        put("ar_ER","، d MMM");
        put("ar_IL","، d MMM");
        put("ar_IQ","، d MMM");
        put("ar_JO","، d MMM");
        put("ar_KM","، d MMM");
        put("ar_KW","، d MMM");
        put("ar_LB","، d MMM");
        put("ar_LY","، d MMM");
        put("ar_MA","، d MMM");
        put("ar_MR","، d MMM");
        put("ar_OM","، d MMM");
        put("ar_PS","، d MMM");
        put("ar_QA","، d MMM");
        put("ar_SA","، d MMM");
        put("ar_SD","، d MMM");
        put("ar_SO","، d MMM");
        put("ar_SS","، d MMM");
        put("ar_SY","، d MMM");
        put("ar_TD","، d MMM");
        put("ar_TN","، d MMM");
        put("ar_XB","، d MMM");
        put("ar_YE","، d MMM");
        put("as","d MMM");
        put("as_IN","d MMM");
        put("asa","d MMM");
        put("asa_TZ","d MMM");
        put("ast","d MMM");
        put("ast_ES","d MMM");
        put("az","d MMM");
        put("az_Cyrl","d MMM");
        put("az_Cyrl_AZ","d MMM");
        put("az_Latn","d MMM");
        put("az_Latn_AZ","d MMM");
        put("bas","d MMM");
        put("bas_CM","d MMM");
        put("be","d MMM");
        put("be_BY","d MMM");
        put("bem","d MMM");
        put("bem_ZM","d MMM");
        put("bez","d MMM");
        put("bez_TZ","d MMM");
        put("bg","d MMM");
        put("bg_BG","d MMM");
        put("bm","d MMM");
        put("bm_ML","d MMM");
        put("bn","d MMM");
        put("bn_BD","d MMM");
        put("bn_IN","d MMM");
        put("bo","MMMའི་ཚེས་d");
        put("bo_CN","MMMའི་ཚེས་d");
        put("bo_IN","MMMའི་ཚེས་d");
        put("br","d MMM");
        put("br_FR","d MMM");
        put("brx","MMM d");
        put("brx_IN","MMM d");
        put("bs","d. MMM ");
        put("bs_Cyrl","dd. MMM ");
        put("bs_Cyrl_BA","dd. MMM ");
        put("bs_Latn","d. MMM ");
        put("bs_Latn_BA","d. MMM ");
        put("ca","d MMM");
        put("ca_AD","d MMM");
        put("ca_ES","d MMM");
        put("ca_FR","d MMM");
        put("ca_IT","d MMM");
        put("ccp","d MMM");
        put("ccp_BD","d MMM");
        put("ccp_IN","d MMM");
        put("ce","MMM d");
        put("ce_RU","MMM d");
        put("cgg","d MMM");
        put("cgg_UG","d MMM");
        put("chr","MMM d");
        put("chr_US","MMM d");
        put("ckb","MMM d");
        put("ckb_IQ","MMM d");
        put("ckb_IR","MMM d");
        put("cs","d. MMM");
        put("cs_CZ","d. MMM");
        put("cy","d MMM");
        put("cy_GB","d MMM");
        put("da","'den' d. MMM");
        put("da_DK","'den' d. MMM");
        put("da_GL","'den' d. MMM");
        put("dav","d MMM");
        put("dav_KE","d MMM");
        put("de","d. MMM");
        put("de_AT","d. MMM");
        put("de_BE","d. MMM");
        put("de_CH","d. MMM");
        put("de_DE","d. MMM");
        put("de_IT","d. MMM");
        put("de_LI","d. MMM");
        put("de_LU","d. MMM");
        put("dje","d MMM");
        put("dje_NE","d MMM");
        put("dsb","d. MMM");
        put("dsb_DE","d. MMM");
        put("dua","d MMM");
        put("dua_CM","d MMM");
        put("dyo","d MMM");
        put("dyo_SN","d MMM");
        put("dz","MMM ཚེས་dd");
        put("dz_BT","MMM ཚེས་dd");
        put("ebu","d MMM");
        put("ebu_KE","d MMM");
        put("ee","MMM d");
        put("ee_GH","MMM d");
        put("ee_TG","MMM d");
        put("el","d MMM");
        put("el_CY","d MMM");
        put("el_GR","d MMM");
        put("en","MMM d");
        put("en_001","d MMM");
        put("en_150","d MMM");
        put("en_AG","d MMM");
        put("en_AI","d MMM");
        put("en_AS","MMM d");
        put("en_AT","d MMM");
        put("en_AU","d MMM");
        put("en_BB","d MMM");
        put("en_BE","d MMM");
        put("en_BI","MMM d");
        put("en_BM","d MMM");
        put("en_BS","d MMM");
        put("en_BW","dd MMM");
        put("en_BZ","dd MMM");
        put("en_CA","MMM d");
        put("en_CC","d MMM");
        put("en_CH","d MMM");
        put("en_CK","d MMM");
        put("en_CM","d MMM");
        put("en_CX","d MMM");
        put("en_CY","d MMM");
        put("en_DE","d MMM");
        put("en_DG","d MMM");
        put("en_DK","d MMM");
        put("en_DM","d MMM");
        put("en_ER","d MMM");
        put("en_FI","d MMM");
        put("en_FJ","d MMM");
        put("en_FK","d MMM");
        put("en_FM","d MMM");
        put("en_GB","d MMM");
        put("en_GD","d MMM");
        put("en_GG","d MMM");
        put("en_GH","d MMM");
        put("en_GI","d MMM");
        put("en_GM","d MMM");
        put("en_GU","MMM d");
        put("en_GY","d MMM");
        put("en_HK","d MMM");
        put("en_IE","d MMM");
        put("en_IL","d MMM");
        put("en_IM","d MMM");
        put("en_IN","d MMM");
        put("en_IO","d MMM");
        put("en_JE","d MMM");
        put("en_JM","d MMM");
        put("en_KE","d MMM");
        put("en_KI","d MMM");
        put("en_KN","d MMM");
        put("en_KY","d MMM");
        put("en_LC","d MMM");
        put("en_LR","d MMM");
        put("en_LS","d MMM");
        put("en_MG","d MMM");
        put("en_MH","MMM d");
        put("en_MO","d MMM");
        put("en_MP","MMM d");
        put("en_MS","d MMM");
        put("en_MT","d MMM");
        put("en_MU","d MMM");
        put("en_MW","d MMM");
        put("en_MY","d MMM");
        put("en_NA","d MMM");
        put("en_NF","d MMM");
        put("en_NG","d MMM");
        put("en_NL","d MMM");
        put("en_NR","d MMM");
        put("en_NU","d MMM");
        put("en_NZ","d MMM");
        put("en_PG","d MMM");
        put("en_PH","d MMM");
        put("en_PK","d MMM");
        put("en_PN","d MMM");
        put("en_PR","MMM d");
        put("en_PW","d MMM");
        put("en_RW","d MMM");
        put("en_SB","d MMM");
        put("en_SC","d MMM");
        put("en_SD","d MMM");
        put("en_SE","d MMM");
        put("en_SG","d MMM");
        put("en_SH","d MMM");
        put("en_SI","d MMM");
        put("en_SL","d MMM");
        put("en_SS","d MMM");
        put("en_SX","d MMM");
        put("en_SZ","d MMM");
        put("en_TC","d MMM");
        put("en_TK","d MMM");
        put("en_TO","d MMM");
        put("en_TT","d MMM");
        put("en_TV","d MMM");
        put("en_TZ","d MMM");
        put("en_UG","d MMM");
        put("en_UM","MMM d");
        put("en_US","MMM d");
        put("en_US_POSIX","MMM d");
        put("en_VC","d MMM");
        put("en_VG","d MMM");
        put("en_VI","MMM d");
        put("en_VU","d MMM");
        put("en_WS","d MMM");
        put("en_XA","[MMM d]");
        put("en_ZA","dd MMM");
        put("en_ZM","d MMM");
        put("en_ZW","dd MMM");
        put("eo","d_'a' 'de' MMM");
        put("es","d 'de' MMM");
        put("es_419","d 'de' MMM");
        put("es_AR","d 'de' MMM");
        put("es_BO","d 'de' MMM");
        put("es_BR","d 'de' MMM");
        put("es_BZ","d 'de' MMM");
        put("es_CL","d 'de' MMM");
        put("es_CO","d 'de' MMM");
        put("es_CR","d 'de' MMM");
        put("es_CU","d 'de' MMM");
        put("es_DO","d 'de' MMM");
        put("es_EA","d 'de' MMM");
        put("es_EC","d 'de' MMM");
        put("es_ES","d 'de' MMM");
        put("es_GQ","d 'de' MMM");
        put("es_GT","d 'de' MMM");
        put("es_HN","dd 'de' MMM");
        put("es_IC","d 'de' MMM");
        put("es_MX","d 'de' MMM");
        put("es_NI","d 'de' MMM");
        put("es_PA","d 'de' MMM");
        put("es_PE","d 'de' MMM");
        put("es_PH","d 'de' MMM");
        put("es_PR","d 'de' MMM");
        put("es_PY","d 'de' MMM");
        put("es_SV","d 'de' MMM");
        put("es_US","d 'de' MMM");
        put("es_UY","d 'de' MMM");
        put("es_VE","d 'de' MMM");
        put("et","d. MMM");
        put("et_EE","d. MMM");
        put("eu","MMM d");
        put("eu_ES","MMM d");
        put("ewo","d MMM");
        put("ewo_CM","d MMM");
        put("fa","d MMM");
        put("fa_AF","d MMM");
        put("fa_IR","d MMM");
        put("ff","d MMM");
        put("fi","cccc d. MMM");
        put("fi_FI","cccc d. MMM");
        put("fil","MMM d");
        put("fil_PH","MMM d");
        put("fo","d. MMM");
        put("fo_DK","d. MMM");
        put("fo_FO","d. MMM");
        put("fr","d MMM");
        put("fr_BE","d MMM");
        put("fr_BF","d MMM");
        put("fr_BI","d MMM");
        put("fr_BJ","d MMM");
        put("fr_BL","d MMM");
        put("fr_CA","d MMM");
        put("fr_CD","d MMM");
        put("fr_CF","d MMM");
        put("fr_CG","d MMM");
        put("fr_CH","d MMM");
        put("fr_CI","d MMM");
        put("fr_CM","d MMM");
        put("fr_DJ","d MMM");
        put("fr_DZ","d MMM");
        put("fr_FR","d MMM");
        put("fr_GA","d MMM");
        put("fr_GF","d MMM");
        put("fr_GN","d MMM");
        put("fr_GP","d MMM");
        put("fr_GQ","d MMM");
        put("fr_HT","d MMM");
        put("fr_KM","d MMM");
        put("fr_LU","d MMM");
        put("fr_MA","d MMM");
        put("fr_MC","d MMM");
        put("fr_MF","d MMM");
        put("fr_MG","d MMM");
        put("fr_ML","d MMM");
        put("fr_MQ","d MMM");
        put("fr_MR","d MMM");
        put("fr_MU","d MMM");
        put("fr_NC","d MMM");
        put("fr_NE","d MMM");
        put("fr_PF","d MMM");
        put("fr_PM","d MMM");
        put("fr_RE","d MMM");
        put("fr_RW","d MMM");
        put("fr_SC","d MMM");
        put("fr_SN","d MMM");
        put("fr_SY","d MMM");
        put("fr_TD","d MMM");
        put("fr_TG","d MMM");
        put("fr_TN","d MMM");
        put("fr_VU","d MMM");
        put("fr_WF","d MMM");
        put("fr_YT","d MMM");
        put("fur","d 'di' MMM");
        put("fur_IT","d 'di' MMM");
        put("fy","d MMM");
        put("fy_NL","d MMM");
        put("ga","d MMM");
        put("ga_IE","d MMM");
        put("gd","d'mh' MMM");
        put("gd_GB","d'mh' MMM");
        put("gl","d 'de' MMM");
        put("gl_ES","d 'de' MMM");
        put("gsw","d. MMM");
        put("gsw_CH","d. MMM");
        put("gsw_FR","d. MMM");
        put("gsw_LI","d. MMM");
        put("gu","d MMM");
        put("gu_IN","d MMM");
        put("guz","d MMM");
        put("guz_KE","d MMM");
        put("gv","MMM d");
        put("gv_IM","MMM d");
        put("ha","d MMM");
        put("ha_GH","d MMM");
        put("ha_NE","d MMM");
        put("ha_NG","d MMM");
        put("haw","d MMM");
        put("haw_US","d MMM");
        put("he","d בMMM");
        put("he_IL","d בMMM");
        put("hi","d MMM");
        put("hi_IN","d MMM");
        put("hr","d. MMM ");
        put("hr_BA","d. MMM ");
        put("hr_HR","d. MMM ");
        put("hsb","d. MMM");
        put("hsb_DE","d. MMM");
        put("hu","MMM d.");
        put("hu_HU","MMM d.");
        put("hy","MMM d");
        put("hy_AM","MMM d");
        put("ia","'le' d 'de' MMM");
        put("ia_001","'le' d 'de' MMM");
        put("id","dd MMM");
        put("id_ID","dd MMM");
        put("ig","d MMM");
        put("ig_NG","d MMM");
        put("ii","MMM d");
        put("ii_CN","MMM d");
        put("is","d. MMM");
        put("is_IS","d. MMM");
        put("it","d MMM");
        put("it_CH","d MMM");
        put("it_IT","d MMM");
        put("it_SM","d MMM");
        put("it_VA","d MMM");
        put("ja","M月d日");
        put("ja_JP","M月d日");
        put("jgo","MMM dd");
        put("jgo_CM","MMM dd");
        put("jmc","d MMM");
        put("jmc_TZ","d MMM");
        put("jv","d MMM");
        put("jv_ID","d MMM");
        put("ka","dd MMM");
        put("ka_GE","dd MMM");
        put("kab","d MMM");
        put("kab_DZ","d MMM");
        put("kam","d MMM");
        put("kam_KE","d MMM");
        put("kde","d MMM");
        put("kde_TZ","d MMM");
        put("kea","d 'di' MMM");
        put("kea_CV","d 'di' MMM");
        put("khq","d MMM");
        put("khq_ML","d MMM");
        put("ki","d MMM");
        put("ki_KE","d MMM");
        put("kk","d MMM");
        put("kk_KZ","d MMM");
        put("kkj","dd MMM");
        put("kkj_CM","dd MMM");
        put("kl","MMM d");
        put("kl_GL","MMM d");
        put("kln","d MMM");
        put("kln_KE","d MMM");
        put("km","d MMM");
        put("km_KH","d MMM");
        put("kn","MMM d");
        put("kn_IN","MMM d");
        put("ko","M월 d일");
        put("ko_KP","M월 d일");
        put("ko_KR","M월 d일");
        put("kok","d MMM");
        put("kok_IN","d MMM");
        put("ks","MMM d");
        put("ks_IN","MMM d");
        put("ksb","d MMM");
        put("ksb_TZ","d MMM");
        put("ksf","d MMM");
        put("ksf_CM","d MMM");
        put("ksh","'dä' d. MMM");
        put("ksh_DE","'dä' d. MMM");
        put("ku","MMM d");
        put("ku_TR","MMM d");
        put("kw","MMM d");
        put("kw_GB","MMM d");
        put("ky","d_MMM");
        put("ky_KG","d_MMM");
        put("lag","d MMM");
        put("lag_TZ","d MMM");
        put("lb","d. MMM");
        put("lb_LU","d. MMM");
        put("lg","d MMM");
        put("lg_UG","d MMM");
        put("lkt","MMM d");
        put("lkt_US","MMM d");
        put("ln","d MMM");
        put("ln_AO","d MMM");
        put("ln_CD","d MMM");
        put("ln_CF","d MMM");
        put("ln_CG","d MMM");
        put("lo","ທີ d MMM");
        put("lo_LA","ທີ d MMM");
        put("lrc","MMM d");
        put("lrc_IQ","MMM d");
        put("lrc_IR","MMM d");
        put("lt","MMM d 'd'.");
        put("lt_LT","MMM d 'd'.");
        put("lu","d MMM");
        put("lu_CD","d MMM");
        put("luo","d MMM");
        put("luo_KE","d MMM");
        put("luy","d MMM");
        put("luy_KE","d MMM");
        put("lv","'gada' d. MMM");
        put("lv_LV","'gada' d. MMM");
        put("mas","d MMM");
        put("mas_KE","d MMM");
        put("mas_TZ","d MMM");
        put("mer","d MMM");
        put("mer_KE","d MMM");
        put("mfe","d MMM");
        put("mfe_MU","d MMM");
        put("mg","d MMM");
        put("mg_MG","d MMM");
        put("mgh","d MMM");
        put("mgh_MZ","d MMM");
        put("mgo","MMM dd");
        put("mgo_CM","MMM dd");
        put("mi","MMM d");
        put("mi_NZ","MMM d");
        put("mk","dd MMM");
        put("mk_MK","dd MMM");
        put("ml","MMM d");
        put("ml_IN","MMM d");
        put("mn","MM.dd");
        put("mn_MN","MM.dd");
        put("mr","d MMM");
        put("mr_IN","d MMM");
        put("ms","d MMM");
        put("ms_BN","dd MMM");
        put("ms_MY","d MMM");
        put("ms_SG","d MMM");
        put("mt","d 'ta'’ MMM");
        put("mt_MT","d 'ta'’ MMM");
        put("mua","d MMM");
        put("mua_CM","d MMM");
        put("my","၊ MMM d၊");
        put("my_MM","၊ MMM d၊");
        put("mzn","MMM d");
        put("mzn_IR","MMM d");
        put("naq","d MMM");
        put("naq_NA","d MMM");
        put("nb","d. MMM");
        put("nb_NO","d. MMM");
        put("nb_SJ","d. MMM");
        put("nd","d MMM");
        put("nd_ZW","d MMM");
        put("nds","MMM d");
        put("nds_DE","MMM d");
        put("nds_NL","MMM d");
        put("ne","MMM d");
        put("ne_IN","MMM d");
        put("ne_NP","MMM d");
        put("nl","d MMM");
        put("nl_AW","d MMM");
        put("nl_BE","d MMM");
        put("nl_BQ","d MMM");
        put("nl_CW","d MMM");
        put("nl_NL","d MMM");
        put("nl_SR","d MMM");
        put("nl_SX","d MMM");
        put("nmg","d MMM");
        put("nmg_CM","d MMM");
        put("nn","d. MMM");
        put("nn_NO","d. MMM");
        put("nnh","'lyɛ'̌ʼ d 'na' MMM");
        put("nnh_CM","'lyɛ'̌ʼ d 'na' MMM");
        put("nus","d MMM");
        put("nus_SS","d MMM");
        put("nyn","d MMM");
        put("nyn_UG","d MMM");
        put("om","MMM d");
        put("om_ET","MMM d");
        put("om_KE","MMM d");
        put("or","MMM d");
        put("or_IN","MMM d");
        put("os","d MMM");
        put("os_GE","d MMM");
        put("os_RU","d MMM");
        put("pa","d MMM");
        put("pa_Arab","dd MMM");
        put("pa_Arab_PK","dd MMM");
        put("pa_Guru","d MMM");
        put("pa_Guru_IN","d MMM");
        put("pl","d MMM");
        put("pl_PL","d MMM");
        put("ps","MMM d");
        put("ps_AF","MMM d");
        put("pt","d 'de' MMM");
        put("pt_AO","d 'de' MMM");
        put("pt_BR","d 'de' MMM");
        put("pt_CH","d 'de' MMM");
        put("pt_CV","d 'de' MMM");
        put("pt_GQ","d 'de' MMM");
        put("pt_GW","d 'de' MMM");
        put("pt_LU","d 'de' MMM");
        put("pt_MO","d 'de' MMM");
        put("pt_MZ","d 'de' MMM");
        put("pt_PT","d 'de' MMM");
        put("pt_ST","d 'de' MMM");
        put("pt_TL","d 'de' MMM");
        put("qu","d MMM");
        put("qu_BO","d MMM");
        put("qu_EC","d MMM");
        put("qu_PE","d MMM");
        put("rm","d MMM");
        put("rm_CH","d MMM");
        put("rn","d MMM");
        put("rn_BI","d MMM");
        put("ro","d MMM");
        put("ro_MD","d MMM");
        put("ro_RO","d MMM");
        put("rof","d MMM");
        put("rof_TZ","d MMM");
        put("ru","d MMM");
        put("ru_BY","d MMM");
        put("ru_KG","d MMM");
        put("ru_KZ","d MMM");
        put("ru_MD","d MMM");
        put("ru_RU","d MMM");
        put("ru_UA","d MMM");
        put("rw","MMM d");
        put("rw_RW","MMM d");
        put("rwk","d MMM");
        put("rwk_TZ","d MMM");
        put("sah","MMM d");
        put("sah_RU","MMM d");
        put("saq","d MMM");
        put("saq_KE","d MMM");
        put("sbp","d MMM");
        put("sbp_TZ","d MMM");
        put("sd","MMM d");
        put("sd_PK","MMM d");
        put("se","MMM d");
        put("se_FI","d MMM");
        put("se_NO","MMM d");
        put("se_SE","MMM d");
        put("seh","d 'de' MMM");
        put("seh_MZ","d 'de' MMM");
        put("ses","d MMM");
        put("ses_ML","d MMM");
        put("sg","d MMM");
        put("sg_CF","d MMM");
        put("shi","d MMM");
        put("shi_Latn","d MMM");
        put("shi_Latn_MA","d MMM");
        put("shi_Tfng","d MMM");
        put("shi_Tfng_MA","d MMM");
        put("si","MMM d");
        put("si_LK","MMM d");
        put("sk","d. MMM");
        put("sk_SK","d. MMM");
        put("sl","dd. MMM");
        put("sl_SI","dd. MMM");
        put("smn","cccc MMM d.");
        put("smn_FI","cccc MMM d.");
        put("sn","MMM d");
        put("sn_ZW","MMM d");
        put("so","MMM dd");
        put("so_DJ","MMM dd");
        put("so_ET","MMM dd");
        put("so_KE","MMM dd");
        put("so_SO","MMM dd");
        put("sq","d MMM");
        put("sq_AL","d MMM");
        put("sq_MK","d MMM");
        put("sq_XK","d MMM");
        put("sr","dd. MMM ");
        put("sr_Cyrl","dd. MMM ");
        put("sr_Cyrl_BA","dd. MMM ");
        put("sr_Cyrl_ME","dd. MMM ");
        put("sr_Cyrl_RS","dd. MMM ");
        put("sr_Cyrl_XK","dd. MMM ");
        put("sr_Latn","dd. MMM ");
        put("sr_Latn_BA","dd. MMM ");
        put("sr_Latn_ME","dd. MMM ");
        put("sr_Latn_RS","dd. MMM ");
        put("sr_Latn_XK","dd. MMM ");
        put("sv","d MMM");
        put("sv_AX","d MMM");
        put("sv_FI","d MMM");
        put("sv_SE","d MMM");
        put("sw","d MMM");
        put("sw_CD","d MMM");
        put("sw_KE","d MMM");
        put("sw_TZ","d MMM");
        put("sw_UG","d MMM");
        put("ta","d MMM");
        put("ta_IN","d MMM");
        put("ta_LK","d MMM");
        put("ta_MY","d MMM");
        put("ta_SG","d MMM");
        put("te","d MMM");
        put("te_IN","d MMM");
        put("teo","d MMM");
        put("teo_KE","d MMM");
        put("teo_UG","d MMM");
        put("tg","dd MMM");
        put("tg_TJ","dd MMM");
        put("th","ที่ d MMM");
        put("th_TH","ที่ d MMM");
        put("ti","፣ dd MMM");
        put("ti_ER","፣ dd MMM");
        put("ti_ET","፣ dd MMM");
        put("tk","d MMM");
        put("tk_TM","d MMM");
        put("to","d MMM");
        put("to_TO","d MMM");
        put("tr","d MMM");
        put("tr_CY","d MMM");
        put("tr_TR","d MMM");
        put("tt","d MMM");
        put("tt_RU","d MMM");
        put("twq","d MMM");
        put("twq_NE","d MMM");
        put("tzm","d MMM");
        put("tzm_MA","d MMM");
        put("ug","d_MMM،");
        put("ug_CN","d_MMM،");
        put("uk","d MMM ");
        put("uk_UA","d MMM ");
        put("ur","، d MMM،");
        put("ur_IN","، d MMM،");
        put("ur_PK","، d MMM،");
        put("uz","d_MMM");
        put("uz_Arab","d_MMM");
        put("uz_Arab_AF","d_MMM");
        put("uz_Cyrl","dd MMM");
        put("uz_Cyrl_UZ","dd MMM");
        put("uz_Latn","d_MMM");
        put("uz_Latn_UZ","d_MMM");
        put("vai","d MMM");
        put("vai_Latn","d MMM");
        put("vai_Latn_LR","d MMM");
        put("vai_Vaii","d MMM");
        put("vai_Vaii_LR","d MMM");
        put("vi","d MMM");
        put("vi_VN","d MMM");
        put("vun","d MMM");
        put("vun_TZ","d MMM");
        put("wae","d. MMM");
        put("wae_CH","d. MMM");
        put("wo","d MMM");
        put("wo_SN","d MMM");
        put("xh","MMM d");
        put("xh_ZA","MMM d");
        put("xog","d MMM");
        put("xog_UG","d MMM");
        put("yav","d MMM");
        put("yav_CM","d MMM");
        put("yi","dטן MMM");
        put("yi_001","dטן MMM");
        put("yo","d MMM");
        put("yo_BJ","d MMM");
        put("yo_NG","d MMM");
        put("yue","M月d日");
        put("yue_Hans","M月d日");
        put("yue_Hans_CN","M月d日");
        put("yue_Hant","M月d日");
        put("yue_Hant_HK","M月d日");
        put("zgh","d MMM");
        put("zgh_MA","d MMM");
        put("zh","M月d日");
        put("zh_CN","M月d日");
        put("zh_CH","M月d日");
        put("zh_HK","M月d日");
        put("zh_MO","M月d日");
        put("zh_SG","M月d日");
        put("zh_Hans","M月d日");
        put("zh_Hans_CN","M月d日");
        put("zh_Hans_HK","M月d日");
        put("zh_Hans_MO","M月d日");
        put("zh_Hans_SG","M月d日");
        put("zh_Hant", "M月d日");
        put("zh_Hant_HK","M月d日");
        put("zh_Hant_MO","M月d日");
        put("zh_Hant_TW","M月d日");
        put("zu","MMM d");
        put("zu_ZA","MMM d");
    }};

}
