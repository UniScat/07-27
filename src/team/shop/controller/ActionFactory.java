package team.shop.controller;

import team.shop.controller.action.Action;  
import team.shop.controller.action.CartDelete;
import team.shop.controller.action.CartInsert;
import team.shop.controller.action.CartList;
import team.shop.controller.action.CartPayment;
import team.shop.controller.action.CategoryDetailAction;
import team.shop.controller.action.IndexAction;
import team.shop.controller.action.InsertOrder;
import team.shop.controller.action.InsertReview;
import team.shop.controller.action.JoinAction;
import team.shop.controller.action.JoinFormAction;
import team.shop.controller.action.LoginAction;
import team.shop.controller.action.LoginFormAction;
import team.shop.controller.action.LogoutAction;
import team.shop.controller.action.MyPage1Action;
import team.shop.controller.action.MyPage3Action;
import team.shop.controller.action.MyPage3_1_moveAction;
import team.shop.controller.action.MyPage3_2_checkAction;
import team.shop.controller.action.MyPage4_1_updateAction;
import team.shop.controller.action.MyPage5Action;
import team.shop.controller.action.MyPage6Action;
import team.shop.controller.action.MyPage7Action;
import team.shop.controller.action.Payment;
import team.shop.controller.action.ProductDetailAction;
import team.shop.controller.action.ReviewAction;
import team.shop.controller.action.SearchAction;
import team.shop.controller.action.WriteReviewFormAction;
import team.shop.controller.action.askAction;
import team.shop.controller.action.deleveryAction;
import team.shop.controller.action.etcAction;
import team.shop.controller.action.mtmDeleteAction;
import team.shop.controller.action.mtmUpdate;
import team.shop.controller.action.mtmUpdateForm;
import team.shop.controller.action.mtmWriteAction;
import team.shop.controller.action.orderPaymentAction;
import team.shop.controller.action.productInquiryAction;
import team.shop.controller.action.questionAction;
import team.shop.controller.action.returnAction;
import team.shop.controller.action.savingAction;
import team.shop.controller.admin.action.AdminCategoryList;
import team.shop.controller.admin.action.AdminDeleteAction;
import team.shop.controller.admin.action.AdminLoginAction;
import team.shop.controller.admin.action.AdminLoginFormAction;
import team.shop.controller.admin.action.AdminMainAction;
import team.shop.controller.admin.action.AdminMtmList;
import team.shop.controller.admin.action.AdminMtmOneList;
import team.shop.controller.admin.action.AdminMtmUpdateAction;
import team.shop.controller.admin.action.AdminProductInsert;
import team.shop.controller.admin.action.AdminProductInsertForm;
import team.shop.controller.admin.action.AdminReviewCall;
import team.shop.controller.admin.action.AdminReviewDelete;
import team.shop.controller.admin.action.AdminSearch;
import team.shop.controller.admin.action.AdminUpdateAction;
import team.shop.controller.admin.action.AdminUpdateFormAction;
import team.shop.controller.admin.action.admin_memberDeleteAction;
import team.shop.controller.admin.action.admin_memberDetailUpdateAction;
import team.shop.controller.admin.action.admin_memberDetailViewAction;
import team.shop.controller.admin.action.admin_memberListsearchAction;
import team.shop.controller.admin.action.admin_memberListselectAction;

public class ActionFactory {
	//�떛湲��넠 �삎�깭濡� �쑀�씪�븯寃� �븳 媛쒖쓽 媛앹껜留� �깮�꽦�븯怨� getInstance()濡� �샇異쒗빐 �궗�슜�븿
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	public static ActionFactory getInstance() {
		return instance;
	}
	//Servlet�뿉�꽌 諛쏆븘�삩 command�뿉 留욌뒗 �븸�뀡媛앹껜瑜� 李얠븘 Servlet�쑝濡� �쟾�떖
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+command);
		
		if(command.equals("category_list")) {
			action = new CategoryDetailAction();
		}else if(command.equals("product_detail")){
			action = new ProductDetailAction();
		}else if(command.equals("search")) {
			action = new SearchAction();
		}else if(command.equals("index")) {
			action = new IndexAction();
		}else if(command.equals("log_in")) {
			action = new LoginAction();
		}else if(command.equals("login_form")) {
			action = new LoginFormAction();
		}else if(command.equals("join_form")) {
			action = new JoinFormAction();
		}else if(command.equals("join")) {
			action = new JoinAction();
		}else if(command.equals("logout")){
			action = new LogoutAction();
		}else if(command.equals("review")) {
			action = new ReviewAction();
		}else if(command.equals("mypage_1")) {
			action = new MyPage1Action();
		}else if(command.equals("mypage_2")) {
			action = new WriteReviewFormAction();
		}else if(command.equals("mypage3_1_moveAction")) {
			action = new MyPage3_1_moveAction();
		}else if(command.equals("mypage3_2_checkAction")) {
			action = new MyPage3_2_checkAction();
		}else if(command.equals("mypage4_1_updateAction")) {
			action = new MyPage4_1_updateAction();
		}else if(command.equals("mypage_5")) {
			action = new MyPage5Action();
		}else if(command.equals("mypage_6")) {
			action = new MyPage6Action();
		}else if(command.equals("mypage_7")) {
			action = new MyPage7Action();
		}else if(command.equals("ask")) {
			action = new askAction();
		}else if(command.equals("question_main")) {
			action = new questionAction();
		}else if(command.equals("product_inquiry")) {
			action = new productInquiryAction();
		}else if(command.equals("order_payment")) {
			action = new orderPaymentAction();
		}else if(command.equals("delivery")) {
			action = new deleveryAction();
		}else if(command.equals("return")) {
			action = new returnAction();
		}else if(command.equals("saving")) {
			action = new savingAction();
		}else if(command.equals("etc")) {
			action = new etcAction();
		}else if(command.equals("mtm")) {
			action = new mtmWriteAction();
		}else if(command.equals("mtmUpdate")){
			action = new mtmUpdate();
		}else if(command.equals("mtmUpdateForm")) {
			action = new mtmUpdateForm();
		}else if(command.equals("mtmDelete")) {
			action = new mtmDeleteAction();
		}else if(command.equals("payment")) {
			action = new Payment();
		}else if(command.equals("insert_order")) {
			action = new InsertOrder();
		}else if(command.equals("insert_review")) {
			action = new InsertReview();
		}else if(command.equals("cart_insert")) {
			action = new CartInsert();
		}else if(command.equals("cart_list")) {
			action = new CartList();
		}else if(command.equals("cart_delete")) {
			action = new CartDelete();
		}else if(command.equals("cart_payment")) {
			action = new CartPayment();
		}
		
		
			
		//admin Action
		else if(command.equals("admin_loginForm")) {
			action = new AdminLoginFormAction();
		}else if(command.equals("admin_login")) {
			action = new AdminLoginAction();
		}else if(command.equals("admin_main")) {
			action = new AdminMainAction();
		}else if(command.equals("admin_product_UpdateForm")) {
			action = new AdminUpdateFormAction();
		}else if(command.equals("admin_pUpdate")) {
			action = new AdminUpdateAction();
		}else if(command.equals("admin_pDelete")) {
			action = new AdminDeleteAction();
		}else if(command.equals("admin_category_list")) {
			action = new AdminCategoryList();
		}else if(command.equals("admin_memberList")) {
			action = new admin_memberListselectAction();
		}else if(command.equals("admin_memberListsearch")) {
			action = new admin_memberListsearchAction();
		}else if(command.equals("admin_memberDetail")) {
			action = new admin_memberDetailViewAction();
		}else if(command.equals("admin_memberDetailUpdate")) {
			action = new admin_memberDetailUpdateAction();
		}else if(command.equals("admin_memberDelete")) {
			action = new admin_memberDeleteAction();
		}else if(command.equals("admin_mtmList")) {
			action = new AdminMtmList();
		}else if(command.equals("Admin_mtm_one_list")) {
			action = new AdminMtmOneList();
		}else if(command.equals("Admin_mtm_reply_update")) {
			action = new AdminMtmUpdateAction();
		}else if(command.equals("admin_review_call")) {
			action = new AdminReviewCall();
		}else if(command.equals("admin_review_delete")) {
			action = new AdminReviewDelete();
		}else if(command.equals("admin_pInsertForm")) {
			action = new AdminProductInsertForm();
		}else if(command.equals("admin_pInsert")) {
			action = new AdminProductInsert();
		}else if(command.equals("admin_search")) {
			action = new AdminSearch();
		}
		//command�뿉 �빐�떦�븯�뒗 Action�쓣 Servlet�쑝濡� 由ы꽩�빐以�
		return action;
	}
	
}
